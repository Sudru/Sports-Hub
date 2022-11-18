package io.github.sudru.SportsHub.repository;

import io.github.sudru.SportsHub.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository  extends MongoRepository<Team,String> {
}
