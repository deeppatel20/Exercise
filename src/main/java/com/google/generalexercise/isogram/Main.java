package com.google.generalexercise.isogram;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(isIsogram("codedecode"));
        System.out.println(isIsogram("pen"));
    }

    static boolean isIsogram(String s) {

        boolean isogram = true;
        char[] chars = s.toCharArray();
        Set<Character> chSet = new HashSet<>();

        for (Character c : chars) {
            if (chSet.contains(c)) {
                isogram = false;
            } else {
                chSet.add(c);
            }
        }
        return isogram;
    }
}
