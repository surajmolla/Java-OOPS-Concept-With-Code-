package com.company;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your row number");
         int n = Input.nextInt();

        for (int row = 1;row<= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);

            }
            System.out.println();
        }
    }
}
