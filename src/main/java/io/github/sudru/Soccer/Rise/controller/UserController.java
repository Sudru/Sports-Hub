package io.github.sudru.Soccer.Rise.controller;

import io.github.sudru.Soccer.Rise.dto.UserRegisterDto;
import io.github.sudru.Soccer.Rise.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserRegisterDto dto) {
        log.info(dto.toString());
        userService.registerUser(dto);
        return "redirect:/register";
    }

}
