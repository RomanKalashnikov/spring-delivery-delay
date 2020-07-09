package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")
class Order {

    @Id
    @GeneratedValue(generator = "GENERATOR_ID")
    private long id;

    @Column(nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Buyer idOwner;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Courier currentCourier;

    @JsonFormat(pattern = "HH:mm:ss  dd-MM-yyyy")
    @Column(nullable = false)
    private LocalDateTime time;

    @JsonFormat(pattern = "HH:mm:ss  dd-MM-yyyy")
    private LocalDateTime newTimeAdding;

    @Column(nullable = false)
    private Boolean execution;
}
