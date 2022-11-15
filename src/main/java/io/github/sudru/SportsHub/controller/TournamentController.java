package io.github.sudru.SportsHub.controller;

import io.github.sudru.SportsHub.dto.SportType;
import io.github.sudru.SportsHub.dto.TournamentRegisterDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class TournamentController {

    @GetMapping("/tournaments")
    public String tournaments(Model model){
        model.addAttribute("sportsTypes",SportType.values());
        model.addAttribute(new TournamentRegisterDto());
        return "tournaments";
    }
    @GetMapping("/tournament/{id}")
    public String details(@PathVariable String id){
        return "tournament-details";
    }
    @PostMapping("/tournaments")
    public String createTournament(@ModelAttribute TournamentRegisterDto dto){
        log.info(dto.toString());

        return "redirect:/tournaments";

    }
}
