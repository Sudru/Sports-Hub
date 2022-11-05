package io.github.sudru.Soccer.Rise.service;

import io.github.sudru.Soccer.Rise.dto.UserRegisterDto;
import io.github.sudru.Soccer.Rise.model.User;
import io.github.sudru.Soccer.Rise.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository repository;

    public boolean registerUser(UserRegisterDto dto){
        if(repository.findByEmail(dto.getEmail())==null) {
            User user = new User();
            user.setName(dto.getName());
            user.setEmail(dto.getEmail());
            user.setPassword(passwordEncoder.encode(dto.getPassword()));
            user.set_id(ObjectId.get());
            repository.save(user);
            return true;
        }
        log.info("User email already exists");
        return false;

    }
}
