package pl.sdacademy.spring.final_project.car_dealer.service;

import pl.sdacademy.spring.final_project.car_dealer.model.Customer;

import java.util.List;

public interface CustomerDataService {

    List<Customer> findAllCustomers();

    void addCustomer(Customer customerToSave);

    Customer findById(Long customerID);

    Customer findByPesel(String pesel);

    Customer findByNip(String nip);
}
