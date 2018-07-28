package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.VehicleModel;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<VehicleModel, Long> {
}
