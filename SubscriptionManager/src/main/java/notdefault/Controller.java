package notdefault;

import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    Subscriptions[] subscriptionsarray = new Subscriptions[10];
    @GetMapping("/subscriptions/{id}")
    public ResponseEntity<Subscriptions> getsubscriptions(@PathVariable("id") int id) throws JSONException {
        return ResponseEntity.ok(subscriptionsarray[id]);
    }
    @PutMapping("/subscriptions/{id}")
    public ResponseEntity<Subscriptions> putsubscriptions(@RequestBody Subscriptions subscriptions, @PathVariable("id") int id) {
        subscriptionsarray[id] = subscriptions;
        return ResponseEntity.ok(subscriptions);
    }
    @DeleteMapping("/subscriptions/{id}")
    public void deletesubscriptions(@PathVariable int id) {
        subscriptionsarray[id]=null;
    }
}
