package io.github.sudru.SportsHub.model;

import io.github.sudru.SportsHub.dto.SportType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "tournaments")
@Data
public class Tournament {
    @Id
    private String id;
    private String name;
    private String venue;
    private SportType sportType;
    private int playersPerTeam;
    @DocumentReference(lazy = true)
    private User user;
    private LocalDate startDate;
    private String winner;
    @DocumentReference(lazy = true)
    private List<Team> teams;


}
