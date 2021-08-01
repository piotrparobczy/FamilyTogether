package webapp.FamilyTogether.security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Repository.UserRepository;
import webapp.FamilyTogether.Services.UserServices;
import webapp.FamilyTogether.role.Role;

import java.util.HashSet;
import java.util.Set;


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