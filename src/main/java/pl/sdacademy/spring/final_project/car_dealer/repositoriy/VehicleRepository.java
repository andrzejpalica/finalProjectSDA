package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    List<Vehicle> findAllBySoldIsTrue();

    List<Vehicle> findAllBySoldIsFalse();

    Vehicle findByVin(String vin);

}
