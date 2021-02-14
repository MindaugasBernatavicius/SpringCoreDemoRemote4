package cf.mindaugas._03_spring_di_xml;

import cf.mindaugas._03_spring_di_xml.repository.InMemoryCustomerRepository;
import cf.mindaugas._03_spring_di_xml.service.CustomerService;
import cf.mindaugas._03_spring_di_xml.service.CustomerServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
