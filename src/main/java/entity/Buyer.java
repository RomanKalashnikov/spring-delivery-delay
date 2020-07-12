package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Data
@Table(name = "buyers")
public class Buyer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

}
