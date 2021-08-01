package webapp.FamilyTogether.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import webapp.FamilyTogether.DTO.UserDTO;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Repository.UserRepository;

import java.time.LocalDate;


@Service
public class UserServices  {

  @Autowired
  public   UserRepository userRepository;


  public void createUser(UserDTO userDTO) {

    if (userRepository.existsByEmail(userDTO.getEmail())) {
      System.out.println("User already exist");
      return;
    }

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    User user = new User();
    user.setEmail(userDTO.getEmail());
    user.setPassword(encoder.encode(userDTO.getPassword()));
    user.setFirstName(userDTO.getFirstName());
    user.setLastName(userDTO.getLastName());
    user.setBirthday(LocalDate.parse(userDTO.getBirthday()));

    userRepository.save(user);
  }

  public User findByEmail(String email){
    return userRepository.findByEmail(email);
  };
  public boolean existByEmail(String email){return userRepository.existsByEmail(email);};
  // changeuser
  // deleteuser
  // find-> JPA
  // find ID
  // findALL
  public void changeUser() {}
}
