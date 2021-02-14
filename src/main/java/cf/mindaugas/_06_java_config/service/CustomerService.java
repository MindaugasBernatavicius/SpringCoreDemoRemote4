package cf.mindaugas._06_java_config.service;

import cf.mindaugas._06_java_config.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
