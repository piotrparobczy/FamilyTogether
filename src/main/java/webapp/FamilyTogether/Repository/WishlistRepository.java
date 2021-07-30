package webapp.FamilyTogether.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Model.Wishlist;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
