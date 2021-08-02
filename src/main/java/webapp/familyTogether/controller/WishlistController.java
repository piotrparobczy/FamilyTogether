package webapp.familyTogether.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import webapp.familyTogether.dto.UserDto;
import webapp.familyTogether.model.User;
import webapp.familyTogether.services.UserServices;
import webapp.familyTogether.services.WishlistServices;

@Slf4j
@Controller
public class WishlistController {

  private final UserServices userServices;
  private final WishlistServices wishlistServices;

  public WishlistController(UserServices userServices, WishlistServices wishlistServices) {
    this.userServices = userServices;
    this.wishlistServices = wishlistServices;
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
  public String postWishlistPage(UserDto userDto, BindingResult bindingResult, Model model) {
    userServices.createUser(userDto);
    return "wishlist";
  }
}
