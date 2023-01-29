package com.company;


import java.util.Scanner;

//for loop ,while loop, do while loop
public class ForLoop {
    public static void main(String[] args) {
        int num;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter tyuor number ");
        num = Input.nextInt();

        for ( int a=1;a<50;a=a+2){
            System.out.println(num +"x" + a+ "="+num*a);
            if (a==21)
                break;
            if (a % 2 ==0)
                continue;

        }
    }
}
