package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Data
@Table(name = "buyers")
class Buyer {

    @Id
    @GeneratedValue(generator = "GENERATOR_ID")
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column
    private Order order;



}
