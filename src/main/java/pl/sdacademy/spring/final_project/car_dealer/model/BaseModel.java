package pl.sdacademy.spring.final_project.car_dealer.model;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
