package webapp.familyTogether.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.familyTogether.dto.CalendarEventDto;
import webapp.familyTogether.model.CalendarEvent;
import webapp.familyTogether.services.CalendarServices;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class DashboardController {

  private final CalendarServices calendarServices;

  public DashboardController(CalendarServices calendarServices) {
    this.calendarServices = calendarServices;
  }

  @RequestMapping("/main")
  public String getIndexPage(Model model) {
    List<CalendarEvent> calendarData = calendarServices.findAllByFamilyId(1L);
    List<String> list = new ArrayList<>();
    for (int i = 0; i < calendarData.size(); i++) {
      CalendarEventDto calendarEventDto = new CalendarEventDto();
      calendarEventDto.setDate(calendarData.get(i).getDate().toString());
      calendarEventDto.setUserName(calendarData.get(i).getUser().getFirstName());
      calendarEventDto.setUserLastName(calendarData.get(i).getUser().getLastName());
      list.add(calendarEventDto.toString());
    }
    model.addAttribute("dataList", list.toString());

    return "main";
  }
}
