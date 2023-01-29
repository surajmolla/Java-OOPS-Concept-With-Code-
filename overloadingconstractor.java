package com.oop;

public class overloadingconstractor {
    String name,gender;
    int phone ;

    overloadingconstractor(){
        System.out.println("no value");

    }

    overloadingconstractor(String n, String m ){
        name = n;
        gender = m;



    }
    overloadingconstractor(String n, String m, int p ){
        name = n;
        gender = m;
        phone  = p;


    }

    public void printingmethod(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
    }



}
