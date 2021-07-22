package webapp.FamilyTogether.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.FamilyTogether.Model.Family;
import webapp.FamilyTogether.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
