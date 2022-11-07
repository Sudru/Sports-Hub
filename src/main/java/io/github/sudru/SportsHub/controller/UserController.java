package io.github.sudru.SportsHub.controller;

import io.github.sudru.SportsHub.dto.UserRegisterDto;
import io.github.sudru.SportsHub.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute(new UserRegisterDto());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute UserRegisterDto userRegisterDto, BindingResult result, Model model) {
        log.info(userRegisterDto.toString());
        if (result.getErrorCount() > 0 || !userRegisterDto.getPassword().equals(userRegisterDto.getConfirmPassword())) {
            return "/register";
        }
        boolean status = userService.registerUser(userRegisterDto);
        if (status)
            model.addAttribute("success", "User Added Successfully.");
        else
            model.addAttribute("success","User Already Exists.");
        return "/register";


    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
