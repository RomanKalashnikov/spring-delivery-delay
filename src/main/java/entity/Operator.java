package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "operators")
public class Operator {

    @Id
    @GeneratedValue(generator = "GENERATOR_ID")
    private long id;

    @Column(nullable = false)
    private boolean onLine;
}
