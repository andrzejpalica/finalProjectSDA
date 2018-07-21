package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.VehicleCategory;
import org.springframework.data.repository.CrudRepository;

public interface VehicleCategoryRepository extends CrudRepository<VehicleCategory, Long> {
}
