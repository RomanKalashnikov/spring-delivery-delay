package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "couriers")
public
class Courier {
    @Id
    @GeneratedValue(generator = "GENERATOR_ID")

    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean onLine;


    @Column(nullable = false)
    private Order order;


}
