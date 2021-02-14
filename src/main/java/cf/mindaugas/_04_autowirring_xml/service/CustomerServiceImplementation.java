package cf.mindaugas._04_autowirring_xml.service;

import cf.mindaugas._04_autowirring_xml.model.Customer;
import cf.mindaugas._04_autowirring_xml.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    private CustomerRepository customerRepository;

    // constructor autowirring
    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // autowirring by name
    public void setdatabaseCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
