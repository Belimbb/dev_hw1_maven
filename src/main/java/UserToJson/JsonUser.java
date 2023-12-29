package UserToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUser {
    private User user;

    public JsonUser() {
    }

    public JsonUser(User user) {
        this.user = user;
    }
    public String getJsonUser(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        return json;
    }
}