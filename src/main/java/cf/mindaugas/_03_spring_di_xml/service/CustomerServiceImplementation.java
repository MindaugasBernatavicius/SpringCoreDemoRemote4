package cf.mindaugas._03_spring_di_xml.service;

import cf.mindaugas._03_spring_di_xml.model.Customer;
import cf.mindaugas._03_spring_di_xml.repository.CustomerRepository;
import cf.mindaugas._03_spring_di_xml.repository.DatabaseCustomerRepository;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
