package pl.sdacademy.spring.final_project.car_dealer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pl/sdacademy/spring/final_project/car_dealer/controller/model")
public class Model extends BaseDictionary {

    @Column (name = "mark_id")
    private Long markId;

}
