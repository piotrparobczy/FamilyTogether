package webapp.FamilyTogether.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import webapp.FamilyTogether.Model.User;
import webapp.FamilyTogether.role.Role;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
public class SecurityUser implements UserDetails {

    private final String email;
    private final String password;
    private final List<SimpleGrantedAuthority> authorities;
    private final boolean isActive = true;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isActive;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isActive;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isActive;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }

    public static UserDetails fromUser(User user) {
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(),
                true,
                true,
                true,
                true,
                Role.USER.getAuthorities()
        );
    }
}