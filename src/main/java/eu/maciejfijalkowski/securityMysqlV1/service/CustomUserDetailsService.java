package eu.maciejfijalkowski.securityMysqlV1.service;

import eu.maciejfijalkowski.securityMysqlV1.model.CustomUserDetails;
import eu.maciejfijalkowski.securityMysqlV1.model.User;
import eu.maciejfijalkowski.securityMysqlV1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.findByUserName(username);

        optionalUser.orElseThrow(()->new UsernameNotFoundException("Nie ma takiego uzytkownika"));


//        optionalUser.ifPresent(user -> {new CustomUserDetails(user);});
        return optionalUser.map(CustomUserDetails::new).get();

    }
}
