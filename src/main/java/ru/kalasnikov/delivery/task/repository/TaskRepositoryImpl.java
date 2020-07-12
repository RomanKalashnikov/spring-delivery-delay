package ru.kalasnikov.delivery.task.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.kalasnikov.delivery.task.entity.Task;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskRepositoryImpl implements TaskRepository {
    JdbcTemplate jdbcTemplate;
    private  AtomicLong  idCount = new AtomicLong();

    @Autowired
    public TaskRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Integer resul() {
        int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TASK", Integer.class);
        return result;

    }

    @PostConstruct
    void postInit(){
//        jdbcTemplate.execute("drop table task;");
        jdbcTemplate.execute("create table TASK(" +
                "id integer , order_Number integer , create_Time timestamp ,completed CHAR(1)) ");


        save(new Task( 12L, LocalDateTime.now(), false));
        save(new Task( 84L, LocalDateTime.now().minusHours(1), false));
        save(new Task( 45L, LocalDateTime.now().minusHours(2), false));
        save(new Task( 78L, LocalDateTime.now().minusHours(3), false));
        save(new Task( 97L, LocalDateTime.now().minusHours(1), false));
        save(new Task( 123L, LocalDateTime.now().minusHours(2), false));
        save(new Task( 87L, LocalDateTime.now().minusHours(3), false));
        save(new Task( 12L, LocalDateTime.now().plusHours(1), false));
        save(new Task( 87L, LocalDateTime.now().plusHours(2), false));
    }


    @Override
    public List<Task> findTasksByCreateTimeIsBetweenAndOrderNumber(LocalDateTime start, LocalDateTime end, Long orderNumber) {
        return null;
    }

    @Override
    public List<Task> findTasksByCreateTimeIsBetween(LocalDateTime start, LocalDateTime end) {
        return null;
    }

    @Override
    public Task save(Task task) {
        int a = jdbcTemplate.update("INSERT INTO TASK VALUES (?, ?, ?, ?)", idCount.getAndIncrement(), task.getOrderNumber(), task.getCreateTime(),
               task.isCompleted() ? "1" : "0"  );
        if (a <= 0) {
            throw new RuntimeException("Error");
        }
        return task;
    }

}
