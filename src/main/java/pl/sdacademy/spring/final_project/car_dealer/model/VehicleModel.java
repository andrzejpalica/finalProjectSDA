package pl.sdacademy.spring.final_project.car_dealer.model;

import javax.persistence.*;

@Entity
@Table(name = "car_models")
public class VehicleModel extends BaseDictionary {

    @OneToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
