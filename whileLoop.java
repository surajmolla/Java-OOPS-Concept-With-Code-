package com.company;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int x ;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        x =Input.nextInt();
        //while(true) = infinite time lopp is move
        while (x<=100){
            System.out.println(x);
            x = x+2;
        }
    }
}
