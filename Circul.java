package com.company;

import java.util.Scanner;

public class Circul {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double circul,
        area ;
        System.out.println("Enter Your Radius:");
        circul = Input.nextDouble();
        area = 3.14*circul*circul;
        System.out.println("Your Radiius Is "+area);
    }
}
