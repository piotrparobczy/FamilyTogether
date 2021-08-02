package webapp.familyTogether.service;

import org.springframework.stereotype.Service;
import webapp.familyTogether.model.CalendarEvent;
import webapp.familyTogether.repository.CalendarEventRepository;

import java.util.List;

@Service
public class CalendarService {

  private final CalendarEventRepository calendarEventRepository;

  public CalendarService(CalendarEventRepository calendarEventRepository) {
    this.calendarEventRepository = calendarEventRepository;
  }

  public List<CalendarEvent> findAllByFamilyId(Long id) {
    return calendarEventRepository.findAllByFamilyId(id);
  }

  public void createWish() {}
}
