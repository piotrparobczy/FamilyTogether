package webapp.FamilyTogether.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import webapp.FamilyTogether.DTO.UserDTO;
import webapp.FamilyTogether.Services.UserServices;

import javax.validation.Valid;
@Slf4j
@Controller

public class MainController {

    @Autowired
    private UserServices userServices;

    @RequestMapping("/main")
    public String getIndexPage() {
        return "main";
    }

    @RequestMapping(value = {"/login"})
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String postLoginPage(){

        return "main";
    }

    @GetMapping(value = "/register")
    public String getRegisterPage(Model model) {
        UserDTO userDto = new UserDTO();
        model.addAttribute("userDto", userDto);
        return "register";
    }

    @PostMapping("/register")
    public String getRegisterForm(UserDTO userDto, BindingResult bindingResult, WebRequest request) {
        if (userServices.existByEmail(userDto.getEmail())) {
            bindingResult.rejectValue("email", "error.user",
                    "User '" + userDto.getEmail() + "' is already register");
            return "register";
        }

        if (bindingResult.hasErrors()) {
            return "register";
        }

        userServices.createUser(userDto);

        return "login";
    }


    @RequestMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @RequestMapping("/about-us")
    public String aboutUsPage() {
        return "about-us";
    }
    @RequestMapping("/*")
    public String notFoundPage() {
        return "not-found";
    }
}
