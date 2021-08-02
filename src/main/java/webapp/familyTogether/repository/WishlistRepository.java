package webapp.familyTogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import webapp.familyTogether.model.Wishlist;

import java.util.List;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

    @Query(value = "SELECT i_want FROM wishlists WHERE user_id = ?1",nativeQuery = true)
     List<String> findAllWishes(Long userId);
    @Query(value = "SELECT id FROM wishlists WHERE user_id = ?1",nativeQuery = true)
    List<String> findAllWishesId(Long userId);
}
