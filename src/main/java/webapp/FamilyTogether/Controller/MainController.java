package webapp.FamilyTogether.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.FamilyTogether.DTO.CalendarDto;
import webapp.FamilyTogether.DTO.UserDTO;
import webapp.FamilyTogether.Model.Calendar;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Services.CalendarServices;
import webapp.FamilyTogether.Services.UserServices;
import webapp.FamilyTogether.Services.WishlistServices;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MainController {

  private final UserServices userServices;
  private final WishlistServices wishlistServices;
  private final CalendarServices calendarServices;

  public MainController(
      UserServices userServices,
      WishlistServices wishlistServices,
      CalendarServices calendarServices) {
    this.userServices = userServices;
    this.wishlistServices = wishlistServices;
    this.calendarServices = calendarServices;
  }

  @RequestMapping(value = {"/login"})
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage() {
    return "main";
  }

  @GetMapping(value = "/register")
  public String getRegisterPage(Model model) {
    UserDTO userDto = new UserDTO();
    model.addAttribute("userDto", userDto);
    model.addAttribute("test", userServices.findAllEmails().toString());
    return "register";
  }

  @PostMapping("/register")
  public String postRegisterPage(UserDTO userDto, BindingResult bindingResult, Model model) {
    userServices.createUser(userDto);
    return "login";
  }

  @GetMapping(value = "/wishlist")
  public String getWishlistPage(
      Model model, @CurrentSecurityContext(expression = "authentication?.name") String email) {
    User user = userServices.findByEmail(email);
    String wishlist = wishlistServices.findAllWhishes(user.getId()).toString();
    model.addAttribute("wishlist", wishlist);
    String wishlistId = wishlistServices.findAllWhishesId(user.getId()).toString();
    model.addAttribute("wishlistId", wishlistId);
    return "wishlist";
  }

  @PostMapping("/wishlist")
  public String postWishlistPage(UserDTO userDto, BindingResult bindingResult, Model model) {
    userServices.createUser(userDto);
    return "login";
  }

  @RequestMapping("/main")
  public String getIndexPage(Model model) {
    List<Calendar> calendarData = calendarServices.findAllByFamilyId(1L);
    List<String > list = new ArrayList<>();
    for (int i = 0; i < calendarData.size(); i++) {
        CalendarDto calendarDto = new CalendarDto();
        calendarDto.setDate(calendarData.get(i).getDate().toString());
        calendarDto.setUserName(calendarData.get(i).getUser().getFirstName());
        calendarDto.setUserLastName(calendarData.get(i).getUser().getLastName());
        list.add(calendarDto.toString());
    }
    model.addAttribute("dataList",list.toString());

    return "main";
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
