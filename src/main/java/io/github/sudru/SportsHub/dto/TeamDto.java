package io.github.sudru.SportsHub.dto;

import io.github.sudru.SportsHub.model.Player;
import lombok.Data;

import java.util.List;

@Data
public class TeamDto {
    private String id;
    private String teamName;
    private String manager;
    private String contactNo;
    private List<Player> playersList;
}
