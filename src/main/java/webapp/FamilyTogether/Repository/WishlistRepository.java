package webapp.FamilyTogether.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Model.Wishlist;

import java.util.List;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

    @Query(value = "SELECT i_want FROM wishlists WHERE user_id = ?1",nativeQuery = true)
     List<String> findAllWhishes(Long userId);
    @Query(value = "SELECT id FROM wishlists WHERE user_id = ?1",nativeQuery = true)
    List<String> findAllWhishesId(Long userId);
}
