package webapp.FamilyTogether.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
    @RequestMapping("/main")
    public String getIndexPage() {
        return "main";
    }

    @RequestMapping(value = {"/","*","/login"})
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String postLoginPage(@RequestParam(value = "error", required = false) String error, Model model){
        String errorMessage = null;
        if (error!=null) {
            errorMessage = "Username or Password is incorrect !!";
        }
        model.addAttribute("errorMessage", errorMessage);
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
}
