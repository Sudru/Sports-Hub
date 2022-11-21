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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeamService {
    private final TournamentRepository tournamentRepository;
    private  final TeamRepository teamRepository;

    private final ModelMapper modelMapper;
    public void registerTeam(String id, TeamDto dto){
        Tournament t = tournamentRepository.findById(id).orElseThrow();
        Team  team = modelMapper.map(dto,Team.class);
        log.info(String.valueOf(t.getTeams().size()));
        t.getTeams().add(teamRepository.save(team));
        log.info(String.valueOf(t.getTeams().size()));

        tournamentRepository.save(t);

    }
    public List<TeamDto> getRegisteredTeams(String id){
        Tournament t = tournamentRepository.findById(id).orElseThrow();
        log.info(Arrays.deepToString(t.getTeams().toArray()));
        return t.getTeams().stream().map(a->modelMapper.map(a,TeamDto.class)).collect(Collectors.toList());
    }
}
