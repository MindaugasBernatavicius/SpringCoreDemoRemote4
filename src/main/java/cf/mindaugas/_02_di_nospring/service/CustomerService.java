package cf.mindaugas._02_di_nospring.service;

import cf.mindaugas._02_di_nospring.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
