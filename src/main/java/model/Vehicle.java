package model;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle extends BaseModel {

    @Column
    private String vin;

    @Column(name = "production_year")
    private Long productionYear;

    @OneToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @OneToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Column(name = "insurance_id")
    private String insuranceId;

    @Column(name = "registration_id")
    private String registrationId;

    @OneToOne
    @JoinColumn(name = "fuel_id")
    private Fuel fuel;

    @Column
    private Long mileage;

    @Column
    private Long engine;

    @Column
    private Long power;

    @OneToOne
    @JoinColumn(name = "transmission_id")
    private Transmission transmission;

    @Column
    private String description;

    @Column(name = "test_drives")
    private Long testDrives;

    @Column(name = "vehicle_category")
    private VehicleCategory vehicleCategory;

    @Column(name = "vehicle_type")
    private VehicleType vehicleType;

    @Column
    private Long price;

    @Column
    private boolean sold;

}

