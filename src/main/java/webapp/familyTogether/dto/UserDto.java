package webapp.familyTogether.dto;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class UserDto {

    @NotNull
    @NotEmpty
    @Email
    private String email;


    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    @Length(min = 2,max = 10)
    private String firstName;

    @NotNull
    @NotEmpty
    @Length(min = 2,max = 10)
    private String lastName;

    @NotNull
    @NotEmpty
    private String  birthday;

    public String getEmail() {
        return email;
    }

  @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
  public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


  @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$")
  public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

  @Pattern(regexp = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))")
  public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
