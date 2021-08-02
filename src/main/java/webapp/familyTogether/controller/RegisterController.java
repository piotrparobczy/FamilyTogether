package webapp.familyTogether.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import webapp.familyTogether.dto.UserDto;
import webapp.familyTogether.service.UserService;

@Slf4j
@Controller
public class RegisterController {

  private final UserService userService;

  public RegisterController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "/register")
  public String getRegisterPage(Model model) {
    UserDto userDto = new UserDto();
    model.addAttribute("userDto", userDto);
    model.addAttribute("test", userService.findAllEmails().toString());
    return "register";
  }

  @PostMapping("/register")
  public String postRegisterPage(UserDto userDto, BindingResult bindingResult, Model model) {
    userService.createUser(userDto);
    return "login";
  }
}
