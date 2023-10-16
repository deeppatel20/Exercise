package com.google.json;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "john");
        jsonObject.put("age", 20);
        jsonObject.put("city", "new york");
        System.out.println(jsonObject);
    }
}
