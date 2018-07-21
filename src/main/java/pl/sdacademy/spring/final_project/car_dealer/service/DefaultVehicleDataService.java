package pl.sdacademy.spring.final_project.car_dealer.service;

import pl.sdacademy.spring.final_project.car_dealer.model.Vehicle;
import org.springframework.stereotype.Service;
import pl.sdacademy.spring.final_project.car_dealer.repositoriy.VehicleRepository;

import java.util.List;

@Service
public class DefaultVehicleDataService implements VehicleDataService {

    private VehicleRepository vehicleRepository;

    public DefaultVehicleDataService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> loadAllAvailableVehicles() {
        return vehicleRepository.findAllBySoldIsFalse();
    }

    @Override
    public List<Vehicle> loadAllSoldVehicles() {
        return vehicleRepository.findAllBySoldIsTrue();
    }

    @Override
    public List<Vehicle> loadAllVehicles() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    @Override
    public void addVehicle(Vehicle vehicleToSave) {
        vehicleRepository.save(vehicleToSave);

    }

    @Override
    public Vehicle loadVehicleById(Long vehicleID) {
        return vehicleRepository.findOne(vehicleID);
    }

    @Override
    public Vehicle loadVehicleByVin(String vin) {
        return vehicleRepository.findByVin(vin);
    }
}
