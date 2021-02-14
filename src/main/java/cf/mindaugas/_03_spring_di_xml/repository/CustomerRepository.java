package cf.mindaugas._03_spring_di_xml.repository;

import cf.mindaugas._03_spring_di_xml.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
