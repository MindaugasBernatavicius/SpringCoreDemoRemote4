package cf.mindaugas._02_di_nospring.service;

import cf.mindaugas._02_di_nospring.model.Customer;
import cf.mindaugas._02_di_nospring.repository.CustomerRepository;
import cf.mindaugas._02_di_nospring.repository.DatabaseCustomerRepository;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService{

    // 0. No dependency Injection
    // private CustomerRepository customerRepository = new DatabaseCustomerRepository();

    private CustomerRepository customerRepository;

    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
