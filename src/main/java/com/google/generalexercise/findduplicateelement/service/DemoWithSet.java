package com.google.generalexercise.findduplicateelement.service;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoWithSet {

    public Set<Character> findDuplicate(String s) {

        Set<Character> duplicates = new LinkedHashSet<>();
        Set<Character> characterSet = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (characterSet.contains(s.charAt(i))) {
                duplicates.add(s.charAt(i));
            }else {
                characterSet.add(s.charAt(i));
            }
        }
        System.out.println("Allchars = "+characterSet);
        characterSet.removeAll(duplicates);
        System.out.println("Uniques = "+characterSet);
        return duplicates;
    }
}
