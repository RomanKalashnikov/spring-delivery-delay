package ru.kalasnikov.delivery.task.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    public Task(Long orderNumber, LocalDateTime createTime, boolean completed) {
        this.orderNumber = orderNumber;
        this.createTime = createTime;
        this.completed = completed;
    }

    @Id
    private Long id;

    @Column
    private Long orderNumber;

    @Column(updatable = false)
    private LocalDateTime createTime;

    @Column
    private boolean completed;
}
