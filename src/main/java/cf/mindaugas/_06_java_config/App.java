package cf.mindaugas._06_java_config;

import cf.mindaugas._06_java_config.repository.CustomerRepository;
import cf.mindaugas._06_java_config.repository.DatabaseCustomerRepository;
import cf.mindaugas._06_java_config.repository.InMemoryCustomerRepository;
import cf.mindaugas._06_java_config.service.CustomerService;
import cf.mindaugas._06_java_config.service.CustomerServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"cf.mindaugas._06_java_config"})
class AppConfig {
    // @Bean(name = "customerRepository")
    // public CustomerRepository getCustomerRepository(){
    //     return new InMemoryCustomerRepository();
    // }
    //
    // @Bean(name = "customerService")
    // public CustomerService getCustomerService(){
    //     return new CustomerServiceImplementation();
    // }
}

public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service1.findAll().get(0).getFirstname());
    }
}
