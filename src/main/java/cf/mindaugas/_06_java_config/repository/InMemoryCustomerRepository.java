package cf.mindaugas._06_java_config.repository;

import cf.mindaugas._06_java_config.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

// @Repository("memrepo")
public class InMemoryCustomerRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new LinkedList<>();
        Customer customer = new Customer();
        customer.setFirstname("Jonas from memory");
        customer.setLastname("Jonaitis");
        customers.add(customer);
        return customers;
    }
}
