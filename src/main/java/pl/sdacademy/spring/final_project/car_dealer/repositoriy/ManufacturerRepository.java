package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
}
