package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class Model extends BaseDictionary {

    @Column (name = "mark_id")
    private Long markId;

}
