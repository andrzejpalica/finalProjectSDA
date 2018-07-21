package pl.sdacademy.spring.final_project.car_dealer.service;

import pl.sdacademy.spring.final_project.car_dealer.model.Vehicle;

import java.util.List;

public interface VehicleDataService {

    List<Vehicle> loadAllAvailableVehicles();

    List<Vehicle> loadAllSoldVehicles();

    List<Vehicle> loadAllVehicles();

    void addVehicle(Vehicle vehicleToSave);

    Vehicle loadVehicleById(Long vehicleID);

    Vehicle loadVehicleByVin(String vin);
}
