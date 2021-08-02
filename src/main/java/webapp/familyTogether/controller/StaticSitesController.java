package webapp.familyTogether.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
public class StaticSitesController {

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
