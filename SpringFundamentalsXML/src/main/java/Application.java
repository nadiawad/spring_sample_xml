import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Nadi on 20/12/2017.
 */
public class Application {
    public static void main(String[] args) {
        //CustomerService service = new CustomerServiceImpl();
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService",CustomerService.class);

        System.out.println(service);

        CustomerService service2 = appContext.getBean("customerService",CustomerService.class);

        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}