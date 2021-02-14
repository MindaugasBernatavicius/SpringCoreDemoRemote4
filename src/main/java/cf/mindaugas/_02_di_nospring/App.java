package cf.mindaugas._02_di_nospring;

import cf.mindaugas._02_di_nospring.repository.DatabaseCustomerRepository;
import cf.mindaugas._02_di_nospring.repository.InMemoryCustomerRepository;
import cf.mindaugas._02_di_nospring.service.CustomerService;
import cf.mindaugas._02_di_nospring.service.CustomerServiceImplementation;

public class App {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImplementation(new InMemoryCustomerRepository());
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
