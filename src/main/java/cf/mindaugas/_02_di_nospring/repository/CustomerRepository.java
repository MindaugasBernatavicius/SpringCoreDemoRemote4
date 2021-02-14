package cf.mindaugas._02_di_nospring.repository;

import cf.mindaugas._02_di_nospring.model.Customer;
import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
