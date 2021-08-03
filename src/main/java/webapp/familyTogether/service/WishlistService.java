package webapp.familyTogether.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import webapp.familyTogether.dto.WishlistDto;
import webapp.familyTogether.model.Wishlist;
import webapp.familyTogether.repository.WishlistRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class WishlistService {

  private final WishlistRepository wishlistRepository;

  public WishlistService(WishlistRepository wishlistRepository) {
    this.wishlistRepository = wishlistRepository;
  }


  public List <String > findAllWhishes(Long userId){return wishlistRepository.findAllWishes(userId);}
  public List <String > findAllWhishesId(Long userId){return wishlistRepository.findAllWishesId(userId);}

  public List<String> findAllByUserId(Long userId){
    WishlistService wishlistService = new WishlistService(wishlistRepository);
    List<Wishlist> wishlistList = wishlistRepository.findAllByUser_Id(userId);
    List<String> jsonData = new ArrayList<>();
    for (int i = 0; i < wishlistList.size(); i++) {
      WishlistDto wishlistDto = new WishlistDto(wishlistList.get(i));
      jsonData.add(wishlistService.wishlistDtoToJson(wishlistDto));
    }
    return jsonData;
  }
  public String wishlistDtoToJson(WishlistDto wishlistDto){
    Gson gson = new Gson();
    return gson.toJson(wishlistDto);
  }

  public void createWish() {

  }

}
