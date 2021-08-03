package webapp.familyTogether.dto;

import webapp.familyTogether.model.CalendarEvent;

public class CalendarEventDto {
    private String date;
    private String userName;
    private String userLastName;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public CalendarEventDto calendarToDto(CalendarEvent calendar){
        CalendarEventDto calendarEventDto = new CalendarEventDto();
        calendarEventDto.setDate(calendar.getDate().toString());
        calendarEventDto.setUserName(calendar.getUser().getFirstName());
        calendarEventDto.setUserLastName(calendar.getUser().getLastName());
        return calendarEventDto;
    }

    @Override
    public String toString() {
        return "" + date + "|" + userName+"|"+userLastName;
    }
}
