package notdefault;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service {

    public static void main(String[] args) throws JSONException {
        SpringApplication.run(Service.class, args);

        Customer c = new Customer(1);
        String[] types = {"Other","Broadband","TV"};
        int[] durations = {634,2,78};
        Subscriptions subscriptions = new Subscriptions(types,durations);
        c.addSubscriptions(subscriptions);
        System.out.println();
        System.out.println("Put");
        System.out.println(subscriptions.toString());
        System.out.println();

        subscriptions = c.readSubscriptions();
        System.out.println("Get");
        System.out.println(subscriptions.toString());
        System.out.println();

        //Delete
        System.out.println("Delete");
        c.removeSubscriptions();
        System.out.println();

        System.out.println("Get");
        subscriptions = c.readSubscriptions();
        System.out.println("Subscriptions = "+subscriptions);
        System.out.println();

    }
}
