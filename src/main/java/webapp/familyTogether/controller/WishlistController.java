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
import webapp.familyTogether.service.UserService;
import webapp.familyTogether.service.WishlistService;

import java.util.List;

@Slf4j
@Controller
public class WishlistController {

  private final UserService userService;
  private final WishlistService wishlistService;

  public WishlistController(UserService userService, WishlistService wishlistService) {
    this.userService = userService;
    this.wishlistService = wishlistService;
  }

  @GetMapping(value = "/wishlist")
  public String getWishlistPage(
      Model model, @CurrentSecurityContext(expression = "authentication?.name") String email) {
    List<String> jsonData = wishlistService.findAllByUserId(userService.findByEmail(email).getId());
    model.addAttribute("jsonData",jsonData);
//    User user = userService.findByEmail(email);
//    String wishlist = wishlistService.findAllWhishes(user.getId()).toString();
//    model.addAttribute("wishlist", wishlist);
//    String wishlistId = wishlistService.findAllWhishesId(user.getId()).toString();
//    model.addAttribute("wishlistId", wishlistId);
    return "wishlist";
  }

  @PostMapping("/wishlist")
  public String postWishlistPage(UserDto userDto, BindingResult bindingResult, Model model) {
    userService.createUser(userDto);
    return "wishlist";
  }
}
