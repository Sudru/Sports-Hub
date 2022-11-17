package io.github.sudru.SportsHub.controller;
import io.github.sudru.SportsHub.dto.TeamDto;
import io.github.sudru.SportsHub.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final TournamentService tournamentService;
    @GetMapping
    public String home(Model model){
        model.addAttribute("tournamentList",tournamentService.getUpcomingTournaments());
        model.addAttribute(new TeamDto());
        return "home";
    }
}
