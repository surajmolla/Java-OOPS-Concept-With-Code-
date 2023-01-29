package com.company;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double n,sum=0;
        System.out.println("Enter your n number:");
        n = Input.nextDouble();
        for (double i= 1;i<=n;i=i+2){
            System.out.print("  "+i);
            sum = sum+i;

        }
        System.out.println();
        System.out.println(sum);
    }
}
