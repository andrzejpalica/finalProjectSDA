package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.Fuel;
import org.springframework.data.repository.CrudRepository;

public interface FuelRepository extends CrudRepository<Fuel, Long> {
}
