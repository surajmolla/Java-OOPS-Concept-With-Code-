package com.oop;

public class defaultconstractor {
    String name,gender;
    int phone;

    ////////////////////////////////////////////////////////////////////////////defult constractor
    defaultconstractor(){
        System.out.println("no value");

    }
//////////////////////////////////////////////////////////////////////////////peremitrize constactor
    defaultconstractor( String n,String m,int p){
        name = n;
        gender = m;
        phone = p;
    }

     public void printing  (){
         System.out.println(name);
         System.out.println(gender);
         System.out.println(phone);
     }

}
