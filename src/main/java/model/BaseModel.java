package model;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
