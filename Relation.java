package com.company;

import java.util.Scanner;

public class Relation {
    public static void main(String[] args) {
        /*Scanner Input = new Scanner(System.in);
        int number;
        System.out.println("Enter Your Number:");
        number = Input.nextInt();

        if(number>10){

            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        int num;
        System.out.println("Enter Your Number:");
        num = Input.nextInt();

        if(num>10){

            System.out.println("True");
        }
        else {
            System.out.println("False");
        }*/

        int count ;
        Scanner Input = new Scanner(System.in);
        System.out.println("enter your number:");
        count = Input.nextInt();


        if(count>10){
            System.out.println("true");

        }
        else if  (count<10) {
            System.out.println("False");
        }
        else if (count ==10){
            System.out.println("Equal");
        }
        else {
            System.out.println("all Are False");
        }
    }
}
