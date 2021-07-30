package webapp.FamilyTogether.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webapp.FamilyTogether.Model.Family;
import webapp.FamilyTogether.Model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByEmail(@Param("email") String email);

    boolean existsByEmail(String email);


}
