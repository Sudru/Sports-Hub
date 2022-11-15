package io.github.sudru.SportsHub.utils;

import io.github.sudru.SportsHub.model.User;
import io.github.sudru.SportsHub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class SportsHubUtil {
    private final UserRepository userRepository;
    public User getAuthenticatedUser(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByEmail(name).orElseThrow(()->new UsernameNotFoundException("User Does not Exist"));
    }
}
