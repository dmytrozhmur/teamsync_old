package ua.nure.teamsync.repository;

import org.springframework.data.repository.CrudRepository;
import ua.nure.teamsync.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends CrudRepository<Task, UUID> {
    List<Task> findAllByPerformerId(UUID performerId);
}
