package webapp.familyTogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.familyTogether.model.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {


}
