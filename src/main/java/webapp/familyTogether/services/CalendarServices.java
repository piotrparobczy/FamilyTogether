package webapp.familyTogether.services;

import org.springframework.stereotype.Service;
import webapp.familyTogether.model.Calendar;
import webapp.familyTogether.repository.CalendarRepository;

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
