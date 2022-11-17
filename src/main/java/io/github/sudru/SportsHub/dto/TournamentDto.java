package io.github.sudru.SportsHub.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TournamentDto {
    private String id;
    private int noOfTeams;
    private String tournamentName;
    private LocalDate startDate;
    private SportType sportType;
    private String venue;
}
