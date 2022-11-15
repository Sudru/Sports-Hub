package io.github.sudru.SportsHub.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TournamentDto {
    public String id;
    public int noOfTeams;
    public String tournamentName;
    public LocalDate startDate;
    public SportType sportType;
    public String venue;
}
