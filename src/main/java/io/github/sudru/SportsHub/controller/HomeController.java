package io.github.sudru.SportsHub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public ResponseEntity<?> home(){
        return new ResponseEntity<>("Welcome to SoccerRise",HttpStatus.OK);
    }
}