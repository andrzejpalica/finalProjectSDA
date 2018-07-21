package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.VehicleType;
import org.springframework.data.repository.CrudRepository;

public interface VehicleTypeRepository extends CrudRepository<VehicleType, Long> {
}
