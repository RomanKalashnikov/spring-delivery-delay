package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Data
@Table(name = "buyers")
public class Buyer {

    @Id
    @GeneratedValue(generator = "GENERATOR_ID")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column
    private Order order;


}
