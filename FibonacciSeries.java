package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Conting Number ");
        int first =0;
        int second = 1;
        System.out.print(first+" "+second);
        int n;
        n = Input.nextInt();

        for (int i = 3; i<=n; i++)
        {
            int fibo = first+second;
            System.out.print(fibo);
            first =second;
            second =fibo;
        }

    }
}
