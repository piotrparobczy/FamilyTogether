package webapp.FamilyTogether.DTO;

import webapp.FamilyTogether.Model.Calendar;

public class CalendarDto {
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

    public CalendarDto calendarToDto(Calendar calendar){
        CalendarDto calendarDto = new CalendarDto();
        calendarDto.setDate(calendar.getDate().toString());
        calendarDto.setUserName(calendar.getUser().getFirstName());
        calendarDto.setUserLastName(calendar.getUser().getLastName());
        return calendarDto;
    }

    @Override
    public String toString() {
        return "" + date + "|" + userName+"|"+userLastName;
    }
}
