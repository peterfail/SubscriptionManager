package notdefault;

import org.json.*;

import java.util.Arrays;

public class Subscriptions {
    private String[] subscriptiontypes;
    private int[] subscriptiondurations;
    public Subscriptions(String[] subscriptiontypes,int[] subscriptiondurations){
        this.subscriptiontypes = subscriptiontypes;
        this.subscriptiondurations = subscriptiondurations;
    }

    public Subscriptions(){

    }

    public String[] getSubscriptiontypes() {
        return subscriptiontypes;
    }

    public int[] getSubscriptiondurations() {
        return subscriptiondurations;
    }

    public void setSubscriptiontypes(String[] subscriptiontypes) {
        this.subscriptiontypes = subscriptiontypes;
    }

    public void setSubscriptiondurations(int[] subscriptiondurations) {
        this.subscriptiondurations = subscriptiondurations;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("subscriptiontypes",toJSONArray(subscriptiontypes));
        json.put("subscriptiondurations",toJSONArray(subscriptiondurations));
        return json;
    }

    public JSONArray toJSONArray(String[] array){
        JSONArray jsonarray = new JSONArray();
        for (String i:
                array) {
            jsonarray.put(i);
        }
        return jsonarray;
    }

    public JSONArray toJSONArray(int[] array){
        JSONArray jsonarray = new JSONArray();
        for (int i:
                array) {
            jsonarray.put(i);
        }
        return jsonarray;
    }

    @Override
    public String toString() {
        return "Subscriptions{" +
                "subscriptiontypes=" + Arrays.toString(subscriptiontypes) +
                ", subscriptiondurations=" + Arrays.toString(subscriptiondurations) +
                '}';
    }
}
