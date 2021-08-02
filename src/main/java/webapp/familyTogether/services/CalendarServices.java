package webapp.familyTogether.services;

import org.springframework.stereotype.Service;
import webapp.familyTogether.model.CalendarEvent;
import webapp.familyTogether.repository.CalendarEventRepository;

import java.util.List;

@Service
public class CalendarServices {

  private final CalendarEventRepository calendarEventRepository;

  public CalendarServices(CalendarEventRepository calendarEventRepository) {
    this.calendarEventRepository = calendarEventRepository;
  }

  public List<CalendarEvent> findAllByFamilyId(Long id) {
    return calendarEventRepository.findAllByFamilyId(id);
  }

  public void createWish() {}
}
