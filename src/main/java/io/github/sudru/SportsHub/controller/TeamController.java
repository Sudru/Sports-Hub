package io.github.sudru.SportsHub.controller;

import io.github.sudru.SportsHub.dto.TeamDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class TeamController {
    @PostMapping("team/{id}")
    public String registerTeam(@PathVariable String id, @ModelAttribute TeamDto dto){
        log.info(dto.toString());
        return "redirect:/";
    }
}
