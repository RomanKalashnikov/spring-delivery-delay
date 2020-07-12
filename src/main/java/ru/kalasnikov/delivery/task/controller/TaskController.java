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


    @PostMapping
    public TaskDto create(@RequestBody TaskDto taskDto) {
        if (taskDto == null) {
            throw new RuntimeException("Невозможно создаь Task с пустыми полями");
        }
        Task task = mapper.toDomain(taskDto);
        repository.save(task);

        return mapper.toDTO(task);
    }


    //    @GetMapping
//    public List<TaskDto> getAllTasks(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime start,
//                                     @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end,
//                                     @RequestParam(required = false) Long orderNumber) {
//        List<Task> taskList ;
//        if(orderNumber !=null) {
//            taskList = repository.findTasksByCreateTimeIsBetweenAndOrderNumber(start, end, orderNumber);
//        }else {
//            taskList = repository.findTasksByCreateTimeIsBetween(start,end);
//        }
//        return mapper.toDTOList(taskList);
//    }
    @GetMapping
    public String getResult() {

        return String.valueOf(repository.resul());
    }

}
