package ru.kalasnikov.delivery.task.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import ru.kalasnikov.delivery.task.dto.TaskDto;
import ru.kalasnikov.delivery.task.entity.Task;
import ru.kalasnikov.delivery.task.mapper.TaskMapper;
import ru.kalasnikov.delivery.task.repository.TaskRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@Slf4j
@AllArgsConstructor
public class TaskController {

    private final TaskMapper mapper;
    private final TaskRepository repository;

    @PostConstruct
    private void postConstruct() {
        repository.save(new Task(1L,12L,LocalDateTime.now(),false));
        repository.save( new Task(2L,84L,LocalDateTime.now().minusHours(1),false));
        repository.save( new Task(3L,45L,LocalDateTime.now().minusHours(2),false));
        repository.save( new Task(4L,78L,LocalDateTime.now().minusHours(3),false));
        repository.save( new Task(5L,97L,LocalDateTime.now().minusHours(1),false));
        repository.save( new Task(6L,123L,LocalDateTime.now().minusHours(2),false));
        repository.save( new Task(7L,87L,LocalDateTime.now().minusHours(3),false));
        repository.save( new Task(8L,12L,LocalDateTime.now().plusHours(1),false));
        repository.save(new Task(9L,87L,LocalDateTime.now().plusHours(2),false));


    }

    @PostMapping
    public TaskDto create(@RequestBody TaskDto taskDto) {
        if (taskDto == null) {
            throw new RuntimeException("Невозможно создаь Task с пустыми полями");
        }
        Task task = mapper.toDomain(taskDto);
        repository.save(task);

        return mapper.toDTO(task);
    }


    @GetMapping
    public List<TaskDto> getAllTasks(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime start,
                                     @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end,
                                     @RequestParam(required = false) Long orderNumber) {
        List<Task> taskList ;
        if(orderNumber !=null) {
            taskList = repository.findTasksByCreateTimeIsBetweenAndOrderNumber(start, end, orderNumber);
        }else {
            taskList = repository.findTasksByCreateTimeIsBetween(start,end);
        }
        return mapper.toDTOList(taskList);
    }

}
