package pl.sdacademy.spring.final_project.car_dealer.service;

import org.springframework.stereotype.Service;
import pl.sdacademy.spring.final_project.car_dealer.model.*;
import pl.sdacademy.spring.final_project.car_dealer.repositoriy.*;

import java.util.List;

@Service
public class DefaultDictionaryService implements DictionaryService {

    private ManufacturerRepository manufacturerRepository;
    private FuelRepository fuelRepository;
    private ModelRepository modelRepository;
    private TransmissionRepository transmissionRepository;
    private VehicleCategoryRepository vehicleCategoryRepository;
    private VehicleTypeRepository vehicleTypeRepository;


    public DefaultDictionaryService(ManufacturerRepository manufacturerRepository,FuelRepository fuelRepository, ModelRepository modelRepository, TransmissionRepository transmissionRepository, VehicleCategoryRepository vehicleCategoryRepository, VehicleTypeRepository vehicleTypeRepository) {
        this.manufacturerRepository = manufacturerRepository;
        this.fuelRepository = fuelRepository;
        this.modelRepository = modelRepository;
        this.transmissionRepository = transmissionRepository;
        this.vehicleCategoryRepository = vehicleCategoryRepository;
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public List<Manufacturer> getManufacturer() {
        return (List<Manufacturer>) manufacturerRepository.findAll();
    }

    @Override
    public List<VehicleModel> getModel() {
        return (List<VehicleModel>) modelRepository.findAll();
    }

    @Override
    public List<Transmission> getTransmission() {
        return (List<Transmission>) transmissionRepository.findAll();
    }

    @Override
    public List<Fuel> getFuel() {
        return (List<Fuel>) fuelRepository.findAll();
    }

    @Override
    public List<VehicleCategory> getVehicleCategory() {
        return (List<VehicleCategory>) vehicleCategoryRepository.findAll();
    }

    @Override
    public List<VehicleType> getVehicleType() {
        return (List<VehicleType>) vehicleTypeRepository.findAll();
    }
}
