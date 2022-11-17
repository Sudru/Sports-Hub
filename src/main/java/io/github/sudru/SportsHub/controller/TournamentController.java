package io.github.sudru.SportsHub.controller;

import io.github.sudru.SportsHub.dto.SportType;
import io.github.sudru.SportsHub.dto.TournamentRegisterDto;
import io.github.sudru.SportsHub.service.TournamentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequiredArgsConstructor
public class TournamentController {
    private final TournamentService tournamentService;

    @GetMapping("/tournaments")
    public String tournaments(Model model){
        model.addAttribute("sportsTypes",SportType.values());
        model.addAttribute(new TournamentRegisterDto());
        model.addAttribute("tournamentList",tournamentService.getUsersTournaments());
        log.info(tournamentService.getUsersTournaments().toString());
        return "tournaments";
    }
    @GetMapping("/tournament/{id}")
    public String details(@PathVariable String id, Model model){
        model.addAttribute("tournamentDto",tournamentService.tournamentDetails(id));
        model.addAttribute("sportsTypes",SportType.values());
        return "tournament-details";
    }
    @PostMapping("/tournaments")
    public String createTournament(@ModelAttribute TournamentRegisterDto dto){
        log.info(dto.toString());
        tournamentService.createTournament(dto);
        return "redirect:/tournaments";

    }
    @PostMapping("/tournament/update/{id}")
    public String updateTournament(@ModelAttribute TournamentRegisterDto dto,@PathVariable String id){
        tournamentService.updateTournament(id,dto);
        return "redirect:/tournaments";
    }
}
