package com.company;

import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println("its array 1:"+arrayList);

        arrayList2.add(50);
        arrayList2.add(60);
        arrayList2.add(70);
        arrayList2.add(80);
        arrayList2.add(90);

        System.out.println("Its Array 2:"+arrayList2);

        arrayList3.addAll(arrayList);
        System.out.println("Its Array 3:"+arrayList3);

        //how to check equality
         boolean result = arrayList.equals(arrayList3);
        System.out.println("arrayList = arrayList3: "+result );

        boolean result2 = arrayList.equals(arrayList2);
        System.out.println("arrayList = arrayList2: "+result );




    }
}
