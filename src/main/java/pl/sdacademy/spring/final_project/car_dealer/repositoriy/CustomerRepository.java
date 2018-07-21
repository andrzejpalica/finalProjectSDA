package pl.sdacademy.spring.final_project.car_dealer.repositoriy;

import pl.sdacademy.spring.final_project.car_dealer.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByPesel(String pesel);

    Customer findByNip(String nip);

}
