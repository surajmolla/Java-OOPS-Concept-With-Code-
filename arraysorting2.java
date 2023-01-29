package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraysorting2 {
    public static void main(String[] args) {
        ArrayList <Integer> arraysorting = new ArrayList<Integer>();
        arraysorting.add(10);
        arraysorting.add(30);
        arraysorting.add(70);
        arraysorting.add(40);
        System.out.println("befor sorting: " +arraysorting);
        Collections.sort(arraysorting);
        System.out.println("After sorting: "+arraysorting);

        Collections.sort(arraysorting, Collections.reverseOrder());
        System.out.println("after reverese: "+arraysorting);



    }

}
