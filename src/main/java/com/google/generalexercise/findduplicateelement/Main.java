package com.google.generalexercise.findduplicateelement;

import com.google.generalexercise.findduplicateelement.service.DemoWithArrays;
import com.google.generalexercise.findduplicateelement.service.DemoWithMap;
import com.google.generalexercise.findduplicateelement.service.DemoWithSet;

public class Main {
    public static void main(String[] args) {

      /*  DemoWithSet demo = new DemoWithSet();
        System.out.println("duplicates = "+demo.findDuplicate("code decodep"));

        DemoWithArrays demo1 = new DemoWithArrays();
        demo1.findDuplicate("codedecode");*/

        DemoWithMap demo = new DemoWithMap();
        System.out.println("duplicates charcters = "+demo.findDuplicate("code decodepk"));

    }


}
