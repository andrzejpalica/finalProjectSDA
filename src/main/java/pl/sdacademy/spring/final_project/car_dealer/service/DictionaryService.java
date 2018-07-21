package pl.sdacademy.spring.final_project.car_dealer.service;

import pl.sdacademy.spring.final_project.car_dealer.model.*;

import java.util.List;

public interface DictionaryService {

    List<Manufacturer> getManufacturer();

    List<Model> getModel();

    List<Transmission> getTransmission();

    List<Fuel> getFuel();

    List<VehicleCategory> getVehicleCategory();

    List<VehicleType> getVehicleType();

}
