package pl.sdacademy.spring.final_project.car_dealer.model;

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
    private VehicleModel model;

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
    private Long testDrives = 0L;

    @OneToOne
    @JoinColumn(name = "vehicle_category")
    private VehicleCategory vehicleCategory;

    @OneToOne
    @JoinColumn(name = "vehicle_type")
    private VehicleType vehicleType;

    @Column
    private Long price;

    @Column
    private boolean sold;

    public Vehicle() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Long getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Long productionYear) {
        this.productionYear = productionYear;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public VehicleModel getModel() {
        return model;
    }

    public void setModel(VehicleModel model) {
        this.model = model;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public Long getEngine() {
        return engine;
    }

    public void setEngine(Long engine) {
        this.engine = engine;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTestDrives() {
        return testDrives;
    }

    public void setTestDrives(Long testDrives) {
        this.testDrives = testDrives;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}

