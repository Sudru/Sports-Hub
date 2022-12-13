package io.github.sudru.SportsHub.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TournamentRegisterDto implements Serializable {
    @NotEmpty
    private String tournamentName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private SportType sportType;
    private int playersPerTeam;
    @NotEmpty
     private String venue;
}
