package ru.kalasnikov.delivery.task.repository;

import ru.kalasnikov.delivery.task.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findTasksByCreateTimeIsBetweenAndOrderNumber(LocalDateTime start, LocalDateTime end, Long orderNumber);

    List<Task> findTasksByCreateTimeIsBetween(LocalDateTime start, LocalDateTime end);
}
