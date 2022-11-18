package io.github.sudru.SportsHub.controller;

import io.github.sudru.SportsHub.dto.TeamDto;
import io.github.sudru.SportsHub.service.TeamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class TeamController {
    private final TeamService teamService;

    @PostMapping("team/{id}")
    public String registerTeam(@PathVariable String id, @ModelAttribute TeamDto dto){
        log.info(dto.toString());
        teamService.registerTeam(id,dto);
        return "redirect:/";
    }
}
