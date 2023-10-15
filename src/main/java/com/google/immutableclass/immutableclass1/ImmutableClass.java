package com.google.immutableclass.immutableclass1;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass {

   private final int id;
   private final String name;
   private final HashMap<String, String> testMap;

    public ImmutableClass(int id, String name, HashMap<String, String> hashMap) {
        this.id = id;
        this.name = name;

        HashMap<String,String> tempMap =new HashMap<>();
        String key;
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            key=iterator.next();
            tempMap.put(key, hashMap.get(key));
        }
        this.testMap=tempMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }


}
