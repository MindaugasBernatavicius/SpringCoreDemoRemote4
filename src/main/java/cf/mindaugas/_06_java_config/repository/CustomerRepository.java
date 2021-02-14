package cf.mindaugas._06_java_config.repository;

import cf.mindaugas._06_java_config.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
