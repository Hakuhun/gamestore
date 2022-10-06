package hu.haku.gamestore.persistence.dao;

import hu.haku.gamestore.persistence.model.JPARole;
import hu.haku.gamestore.persistence.model.JPAUser;
import hu.haku.gamestore.persistence.repository.RoleRepository;
import hu.haku.gamestore.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
@Log4j2
public class UserDataService implements UserDAO, UserDetailsService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public JPAUser saveUser(JPAUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public JPARole saveRole(JPARole role) {
        return null;
    }

    @Override
    public void addRoleToUser(JPAUser user, JPARole role) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        JPAUser user = userRepo.findByUsername(username);
        if (null == user) {
            log.error("Kaki van a palacsintában.");
        }
        Collection<SimpleGrantedAuthority> authorities = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getType())).collect(Collectors.toList());
        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
