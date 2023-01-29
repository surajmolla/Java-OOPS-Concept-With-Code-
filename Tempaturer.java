package com.company;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Tempaturer {
    public static void main(String[] args) {
        double celsius = 15, faren;
        Scanner Input = new Scanner(System.in);
        System.out.println("enter celsius value:");
        celsius = Input.nextDouble();
        faren = 1.8*celsius+32;
        System.out.println("Your Farenhight:" +faren);


    }
}
