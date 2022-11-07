package io.github.sudru.SportsHub.service;

import io.github.sudru.SportsHub.model.User;
import io.github.sudru.SportsHub.model.UserDetailsImpl;
import io.github.sudru.SportsHub.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username).orElseThrow(()->new UsernameNotFoundException("Invalid Credentials"));
        return new UserDetailsImpl(user);
    }
}
