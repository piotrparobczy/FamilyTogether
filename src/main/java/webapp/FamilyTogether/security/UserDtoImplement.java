package webapp.FamilyTogether.security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.Services.UserServices;

@RequiredArgsConstructor
@Service("UserDtoImplement")
public class UserDtoImplement implements UserDetailsService {

    @Autowired
    private final UserServices userService;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findOneByEmail(email);
        return SecurityUser.fromUser(user);
    }
}
