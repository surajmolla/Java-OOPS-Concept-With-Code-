package com.oop;

public class constractor2 {
    String name;
    String gender;
    int personpin;

    //create a costactor as a method
    constractor2(String n ,String m,int p){
        this.name = n;
        this.gender = m;
       this.personpin = p;
    }

    //printing method
    void printingmethod(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(personpin);

    }

}
