package ua.nure.teamsync.repository;

import org.springframework.data.repository.CrudRepository;
import ua.nure.teamsync.entity.Performer;

import java.util.UUID;

public interface PerformerRepository extends CrudRepository<Performer, UUID> {
}
