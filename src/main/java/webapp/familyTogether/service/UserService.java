package webapp.familyTogether.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import webapp.familyTogether.dto.UserDto;
import webapp.familyTogether.model.Family;
import webapp.familyTogether.model.User;
import webapp.familyTogether.repository.FamilyRepository;
import webapp.familyTogether.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

  private final UserRepository userRepository;
  private final FamilyRepository familyRepository;

  public UserService(UserRepository userRepository, FamilyRepository familyRepository) {
    this.userRepository = userRepository;
    this.familyRepository = familyRepository;
  }


  public void createUser(UserDto userDTO) {

    if (userRepository.existsByEmail(userDTO.getEmail())) {
      System.out.println("User already exist");
      return;
    }

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    List<Family> familyList = new ArrayList<>();
    familyList.add(familyRepository.findById(1L).orElseThrow());
    User user = new User();
    user.setEmail(userDTO.getEmail());
    user.setPassword(encoder.encode(userDTO.getPassword()));
    user.setFirstName(userDTO.getFirstName());
    user.setLastName(userDTO.getLastName());
    user.setBirthday(LocalDate.parse(userDTO.getBirthday()));
    user.setFamily(familyList);
    userRepository.save(user);
  }


  public User findByEmail(String email){
    return userRepository.findByEmail(email);
  };
  public boolean existByEmail(String email){return userRepository.existsByEmail(email);};
public List<String > findAllEmails(){
  List <String> listOfEmails = new ArrayList<>();
  userRepository.findAll().forEach(user->listOfEmails.add(user.getEmail()));
  return listOfEmails;
}
  public Optional<User> findById(Long id){return userRepository.findById(id);}

  // changeuser
  // deleteuser
  // find-> JPA
  // find ID
  // findALL
  public void changeUser() {}
}
