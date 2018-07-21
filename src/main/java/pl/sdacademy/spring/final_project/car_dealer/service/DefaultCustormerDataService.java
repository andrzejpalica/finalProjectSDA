package pl.sdacademy.spring.final_project.car_dealer.service;

import pl.sdacademy.spring.final_project.car_dealer.model.Customer;
import org.springframework.stereotype.Service;
import pl.sdacademy.spring.final_project.car_dealer.repositoriy.CustomerRepository;

import java.util.List;


@Service
public class DefaultCustormerDataService implements CustomerDataService {

    private CustomerRepository customerRepository;

    public DefaultCustormerDataService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public void addCustomer(Customer customerToSave) {
        customerRepository.save(customerToSave);

    }

    @Override
    public Customer findById(Long customerID) {
        return customerRepository.findOne(customerID);
    }

    @Override
    public Customer findByPesel(String pesel) {
        return customerRepository.findByPesel(pesel);
    }

    @Override
    public Customer findByNip(String nip) {
        return customerRepository.findByNip(nip);
    }
}
