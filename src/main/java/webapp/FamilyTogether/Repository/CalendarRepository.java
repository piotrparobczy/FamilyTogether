package webapp.FamilyTogether.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.FamilyTogether.Model.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {

}
