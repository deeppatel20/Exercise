package com.google.collectionexercise.failsafeandfailfastdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class FailFastDemo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Iterator<Integer> iterator = integerList.iterator();

        List<Integer> integerList1 = Arrays.asList(10,20,30);


        List<Integer> integerList2 = List.of(10, 20, 30);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
           //iterator.remove(); // this will not throw error ..check firts whether it is iterator or integerList
           integerList.remove(1); //this will throw an error
        }



        System.out.println(integerList);
    }
}
