package com.company;

import java.util.Scanner;

public class ConditionOperator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int num1,num2,large;
        System.out.println("Enter First Number");
        num1 = Input.nextInt();
        System.out.println("Enter Second Number");
        num2 = Input.nextInt();
        large = num1>num2 ? num1:num2;

        //if = ?,else = :///////////////////////////////////////////////////////////
        System.out.println(large);

    }
}
