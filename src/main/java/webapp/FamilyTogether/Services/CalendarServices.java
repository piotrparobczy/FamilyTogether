package webapp.FamilyTogether.Services;

import org.springframework.stereotype.Service;
import webapp.FamilyTogether.Model.Calendar;
import webapp.FamilyTogether.Repository.CalendarRepository;

import java.util.List;

@Service
public class CalendarServices {

  private final CalendarRepository calendarRepository;

  public CalendarServices(CalendarRepository calendarRepository) {
    this.calendarRepository = calendarRepository;
  }

  public List<Calendar> findAllByFamilyId(Long id) {
    return calendarRepository.findAllByFamilyId(id);
  }

  public void createWish() {}
}
