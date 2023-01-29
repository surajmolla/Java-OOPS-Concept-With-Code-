package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n, m;
        System.out.println("Enter your Intilization Number: ");
        m = Input.nextInt();
        System.out.println("Enter your Final Number: ");
        n = Input.nextInt();
        int sum =0;
        for (int i = m;i <=n;i++){
            if (i%2==0) {
                System.out.print("  "+i);
            }


        }
    }
}
