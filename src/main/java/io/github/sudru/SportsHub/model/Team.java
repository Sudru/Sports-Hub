package io.github.sudru.SportsHub.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collation = "team")
public class Team {
    @Id
    private String id;
    private String name;
    private String manager;
    private String contactNo;
    private List<Player> playersList;
}
