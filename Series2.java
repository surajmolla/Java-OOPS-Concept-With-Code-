package com.company;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        int  n, result = 1;
        Scanner Input = new Scanner(System.in);
        System.out.println("Emter A Number ");
        n = Input.nextInt();
        for (int i = 1; i <=n;i=i+2){
            result = result*1;
            System.out.println(i);
        }

    }
}
