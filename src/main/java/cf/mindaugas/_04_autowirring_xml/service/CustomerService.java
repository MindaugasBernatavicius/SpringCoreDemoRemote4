package cf.mindaugas._04_autowirring_xml.service;

import cf.mindaugas._04_autowirring_xml.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
