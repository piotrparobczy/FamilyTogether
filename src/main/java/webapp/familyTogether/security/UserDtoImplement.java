package webapp.familyTogether.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webapp.familyTogether.model.User;
import webapp.familyTogether.repository.UserRepository;
import webapp.familyTogether.role.Role;


@Service("UserDtoImplement")
public class UserDtoImplement implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserDtoImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) {
        User user = userRepository.findByEmail(email);
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), true, true, true, true, Role.USER.getAuthorities());
    }
}