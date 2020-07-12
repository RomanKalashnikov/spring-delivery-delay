package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long orderNumber;

    @Column(nullable = false)
    @OneToOne
    @PrimaryKeyJoinColumn
    private Buyer buyer;

    @JsonFormat(pattern = "HH:mm:ss  dd-MM-yyyy")
    @Column(nullable = false)
    private LocalDateTime timeDelivery;

    @Column(nullable = false)
    private boolean completed;
}
