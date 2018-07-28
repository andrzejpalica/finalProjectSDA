package pl.sdacademy.spring.final_project.car_dealer.dto;

import pl.sdacademy.spring.final_project.car_dealer.model.*;

import java.util.List;

public class AddVehicleDropDownListDto {

    private static AddVehicleDropDownListDto INSTANCE = new AddVehicleDropDownListDto();
    List<Manufacturer> manufacturers;
    List<VehicleModel> models;
    List<Fuel> fuels;
    List<Transmission> transmissions;
    List<VehicleCategory> vehicleCategories;
    List<VehicleType> vehicleTypes;

    public AddVehicleDropDownListDto() {
    }

    public static AddVehicleDropDownListDto getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(AddVehicleDropDownListDto INSTANCE) {
        AddVehicleDropDownListDto.INSTANCE = INSTANCE;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public List<VehicleModel> getModels() {
        return models;
    }

    public void setModels(List<VehicleModel> models) {
        this.models = models;
    }

    public List<Fuel> getFuels() {
        return fuels;
    }

    public void setFuels(List<Fuel> fuels) {
        this.fuels = fuels;
    }

    public List<Transmission> getTransmissions() {
        return transmissions;
    }

    public void setTransmissions(List<Transmission> transmissions) {
        this.transmissions = transmissions;
    }

    public List<VehicleCategory> getVehicleCategories() {
        return vehicleCategories;
    }

    public void setVehicleCategories(List<VehicleCategory> vehicleCategories) {
        this.vehicleCategories = vehicleCategories;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
