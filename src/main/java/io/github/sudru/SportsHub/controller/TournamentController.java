package io.github.sudru.SportsHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TournamentController {

    @GetMapping("/tournaments")
    public String tournaments(){
        return "tournaments";
    }
    @GetMapping("/tournament/{id}")
    public String details(@PathVariable String id){
        return "tournament-details";
    }
}
