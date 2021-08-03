package webapp.familyTogether.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class LoginController {

  @RequestMapping(value = {"/login"})
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage() {
    return "main";
  }

}
