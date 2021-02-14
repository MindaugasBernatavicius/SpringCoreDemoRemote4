package cf.mindaugas._02_di_nospring.repository;

import cf.mindaugas._02_di_nospring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class DatabaseCustomerRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Jonas from database");
        customer.setLastname("Jonaitis");
        customers.add(customer);
        return customers;
    }
}
