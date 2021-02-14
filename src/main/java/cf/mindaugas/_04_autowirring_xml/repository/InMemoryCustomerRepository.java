package cf.mindaugas._04_autowirring_xml.repository;

import cf.mindaugas._04_autowirring_xml.model.Customer;

import java.util.LinkedList;
import java.util.List;

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
