package cf.mindaugas._05_annotations_xml.repository;

import cf.mindaugas._05_annotations_xml.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
