package io.github.sudru.SportsHub.repository;

import io.github.sudru.SportsHub.model.Tournament;
import io.github.sudru.SportsHub.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface TournamentRepository extends MongoRepository<Tournament,String> {
    List<Tournament> findAllByUser(User user);
    List<Tournament> findAllByStartDateAfter(LocalDate date);
}
