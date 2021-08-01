package webapp.FamilyTogether;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Repository.UserRepository;
import webapp.FamilyTogether.Services.UserServices;

import java.util.Optional;

@SpringBootTest
class FamilyTogetherApplicationTests {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		User user=userRepository.findByEmail("edytakowalska@test.pl");//no
    System.out.println(user);
	}

	@Test
	void hashPassword(){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode("edytakowalska@test.pl");
    	System.out.println(password);
	}

}
