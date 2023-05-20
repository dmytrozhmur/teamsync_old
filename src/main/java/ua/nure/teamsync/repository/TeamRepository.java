package ua.nure.teamsync.repository;

import org.springframework.data.repository.CrudRepository;
import ua.nure.teamsync.entity.Team;

import java.util.UUID;

public interface TeamRepository extends CrudRepository<Team, UUID> {
}
