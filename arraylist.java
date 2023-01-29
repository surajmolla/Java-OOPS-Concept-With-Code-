package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> arraylist = new ArrayList<Integer>();
        //adding element
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);
        //another method to add element
        arraylist.add(0,60);

       // System.out.println(arraylist);

        //with for each loop
       /* for (int x:arraylist){
            System.out.print("  "+x);
        }*/
        //with iterrator method
        Iterator variable = arraylist.iterator();
        while (variable.hasNext()){
            System.out.print( "  "+variable.next());
        }
        /*System.out.println();
        arraylist.remove(2);
        System.out.println("after removing "+ arraylist);*/
        System.out.println();
        /*arraylist.clear();
        System.out.println("after clear"+arraylist);*/

        //how to check arraylist is empty or not
        System.out.println();
        boolean empty = arraylist.isEmpty();
        System.out.println("Check empty: "+empty);

        //how to check my own value that are have in arraylist or not ?
         boolean myelement = arraylist.contains(30);
        System.out.println("30 is one the list: "+myelement);

        //how to check index of those particular value

        int indexofvalue = arraylist.indexOf(50);
        System.out.println("The index of 50 is: "+indexofvalue);

        //how insert value with set method
        arraylist.set(4,100);
        System.out.println("after replace: "+arraylist);

        //how to get a value  of particular index
         int index = arraylist.get(0);
        System.out.println("the value of 0th index is: "+ index);
    }

 {
    }
}
