package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int a ,fact = 1;
        System.out.println("Enter A postive Integer ::");
        a = Input.nextInt();
        for (int i = a;i>=1; i--){
            fact =fact*i;

        }
        System.out.println("Factorial of "+a+" is "+ " = " +fact);
    }

}
