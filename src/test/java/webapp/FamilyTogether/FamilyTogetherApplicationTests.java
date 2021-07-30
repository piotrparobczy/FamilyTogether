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
	UserRepository userRepository;

	@Test
	void contextLoads() {
		User user=userRepository.findOneByEmail("jankowalski@test.pl");//no
	}

	@Test
	void test2(){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode("jankowalski@test.pl");
    	System.out.println(password);
	}

}
