package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(generator = "GENERATOR_ID")
    private Long id;

    @Column(nullable = false)
    private Long orderNumber;

    @Column(nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Buyer buyer;

    @JsonFormat(pattern = "HH:mm:ss  dd-MM-yyyy")
    @Column(nullable = false)
    private LocalDateTime time;

    @JsonFormat(pattern = "HH:mm:ss  dd-MM-yyyy")
    private LocalDateTime newTimeAdding;

    @Column(nullable = false)
    private Boolean execution;
}
