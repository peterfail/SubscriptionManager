package notdefault;

import org.json.*;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Customer {
    int id;
    String url;

    public Customer(int id){
        this.id = id;
        url = "http://localhost:8080/subscriptions/"+id;
    }

    public void addSubscriptions(Subscriptions subscriptions) throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(subscriptions.toJSONObject().toString(),headers);

        restTemplate.put(url, entity, String.class);
    }
    public Subscriptions readSubscriptions(){
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url,Subscriptions.class);
    }
    public void removeSubscriptions(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(url,Subscriptions.class);;
    }
}
