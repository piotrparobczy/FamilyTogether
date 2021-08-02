package webapp.FamilyTogether.Services;

import org.springframework.stereotype.Service;
import webapp.FamilyTogether.Model.Wishlist;
import webapp.FamilyTogether.Repository.WishlistRepository;

import java.util.List;


@Service
public class WishlistServices {

  private final WishlistRepository wishlistRepository;

  public WishlistServices(WishlistRepository wishlistRepository) {
    this.wishlistRepository = wishlistRepository;
  }


  public List <String > findAllWhishes(Long userId){return wishlistRepository.findAllWhishes(userId);}
  public List <String > findAllWhishesId(Long userId){return wishlistRepository.findAllWhishesId(userId);}

  public void createWish() {

  }

}
