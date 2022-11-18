package io.github.sudru.SportsHub.service;

import io.github.sudru.SportsHub.dto.TeamDto;
import io.github.sudru.SportsHub.model.Team;
import io.github.sudru.SportsHub.model.Tournament;
import io.github.sudru.SportsHub.repository.TeamRepository;
import io.github.sudru.SportsHub.repository.TournamentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeamService {
    private final TournamentRepository tournamentRepository;
    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;
    public void registerTeam(String id, TeamDto dto){
        Tournament t = tournamentRepository.findById(id).orElseThrow();
        Team team = teamRepository.save(modelMapper.map(dto,Team.class));
        t.getTeams().add(team);
        log.info(tournamentRepository.save(t).toString());

    }
}
