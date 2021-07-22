package webapp.FamilyTogether.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.FamilyTogether.Model.Family;

@Repository
public interface UserRepository extends JpaRepository<Family, Long> {

}
