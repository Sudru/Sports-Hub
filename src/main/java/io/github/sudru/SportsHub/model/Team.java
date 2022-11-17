package io.github.sudru.SportsHub.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "teams")
@Data
public class Team {
    private String id;
    private String name;
    private String manager;
    private String contactNo;
    private List<Player> playersList;
}
