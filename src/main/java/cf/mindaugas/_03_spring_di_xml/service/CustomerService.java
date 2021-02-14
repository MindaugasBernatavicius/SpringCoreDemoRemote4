package cf.mindaugas._03_spring_di_xml.service;

import cf.mindaugas._03_spring_di_xml.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
