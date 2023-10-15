package com.google.generalexercise.findduplicateelement.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoWithMap {
    public Set<Character> findDuplicate(String s) {
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> allcharacters = new HashSet<>();
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (countMap.containsKey(s.charAt(i))) {
                countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
                duplicates.add(s.charAt(i));
            }else{
                countMap.put(s.charAt(i), 1);
                allcharacters.add(s.charAt(i));
            }
        }
        System.out.println("all characters with repetition "+countMap);
        System.out.println("all characters "+allcharacters);
        allcharacters.removeAll(duplicates);
        System.out.println("Unique characters = "+allcharacters);

        return duplicates;
    }
}
