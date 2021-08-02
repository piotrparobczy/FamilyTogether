package webapp.FamilyTogether.Services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import webapp.FamilyTogether.DTO.UserDTO;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Repository.UserRepository;
import webapp.FamilyTogether.Repository.UserToFamilyRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class UserServices  {

  private final UserRepository userRepository;
  private final UserToFamilyRepository userToFamilyRepository;

  public UserServices(UserRepository userRepository, UserToFamilyRepository userToFamilyRepository) {
    this.userRepository = userRepository;
    this.userToFamilyRepository = userToFamilyRepository;
  }


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

    userToFamilyRepository.insertWithQuery(user);
  }


  public User findByEmail(String email){
    return userRepository.findByEmail(email);
  };
  public boolean existByEmail(String email){return userRepository.existsByEmail(email);};
  public List<String > findAllEmails(){return userRepository.findAllEmails();}
  public Optional<User> findById(Long id){return userRepository.findById(id);}

  // changeuser
  // deleteuser
  // find-> JPA
  // find ID
  // findALL
  public void changeUser() {}
}
