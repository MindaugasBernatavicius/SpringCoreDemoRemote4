package cf.mindaugas._07_simplest_way.repository;

import cf.mindaugas._07_simplest_way.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
