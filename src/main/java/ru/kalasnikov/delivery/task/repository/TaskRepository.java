package ru.kalasnikov.delivery.task.repository;

import org.springframework.stereotype.Repository;
import ru.kalasnikov.delivery.task.entity.Task;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository  {
    List<Task> findTasksByCreateTimeIsBetweenAndOrderNumber(LocalDateTime start, LocalDateTime end, Long orderNumber);

    List<Task> findTasksByCreateTimeIsBetween(LocalDateTime start, LocalDateTime end);

    Task save(Task task);

    Integer resul() ;
}
