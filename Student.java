package com.aggregation;

public class Student {
    String name;
    int rollnoll;
    Address2 address;

    Student(String name,int rollnoll,Address2 address){
        this.name = name;
        this.rollnoll = rollnoll;
        this.address = address;


    }
    public void display(){
        System.out.println("name = "+name);
        System.out.println("roll = "+rollnoll);
        System.out.println("addresss = "+address);
        System.out.println("country = "+address.country);
        System.out.println("phoneno = "+address.phoneno);
    }

    public static void main(String[] args) {
        Address2 ob2 = new Address2("india",11131);
        Student ob = new Student("suraj",12,ob2);
        ob.display();

    }
}
