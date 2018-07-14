package model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer extends BaseModelVersion {

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column
    private String nip;

    @Column
    private String pesel;

}
