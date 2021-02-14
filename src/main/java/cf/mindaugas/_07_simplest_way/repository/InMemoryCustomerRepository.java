package cf.mindaugas._07_simplest_way.repository;

import cf.mindaugas._07_simplest_way.model.Customer;

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
