package io.github.sudru.SportsHub.repository;

import io.github.sudru.SportsHub.model.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TournamentRepository extends MongoRepository<Tournament,String> {
}
