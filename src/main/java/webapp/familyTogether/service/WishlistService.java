package webapp.familyTogether.service;

import org.springframework.stereotype.Service;
import webapp.familyTogether.repository.WishlistRepository;

import java.util.List;


@Service
public class WishlistService {

  private final WishlistRepository wishlistRepository;

  public WishlistService(WishlistRepository wishlistRepository) {
    this.wishlistRepository = wishlistRepository;
  }


  public List <String > findAllWhishes(Long userId){return wishlistRepository.findAllWishes(userId);}
  public List <String > findAllWhishesId(Long userId){return wishlistRepository.findAllWishesId(userId);}

  public void createWish() {

  }

}
