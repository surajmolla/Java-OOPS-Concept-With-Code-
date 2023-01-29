package com.company;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double base,height,area;
        System.out.print("Enter Your Base:");
        base = Input.nextDouble();
        System.out.print("Enter Your Height:");
        height = Input.nextDouble();
        area = 0.5*base*height;
        System.out.println("Your Tringle Area:"+area);


    }
}
