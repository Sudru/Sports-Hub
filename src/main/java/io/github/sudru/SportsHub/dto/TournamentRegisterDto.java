package io.github.sudru.SportsHub.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TournamentRegisterDto implements Serializable {
    @NotEmpty
    public String tournamentName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate startDate;
    public SportType sportType;
    @NotEmpty
    public String venue;
}
