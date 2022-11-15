package io.github.sudru.SportsHub.model;

import io.github.sudru.SportsHub.dto.SportType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDate;

@Document(collection = "tournaments")
@Data
public class Tournament {
    @Id
    public String id;
    public String name;
    public String venue;
    public SportType sportType;
    @DocumentReference(lazy = true)
    public User user;
    public LocalDate startDate;
    public String winner;
}
