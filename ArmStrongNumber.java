package com.company;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int r ,num,sum=0,temp;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        num = Input.nextInt();
        temp = num;

        while (temp!=0){

            r = temp%10;
            sum = sum*10+r*r*r;
            temp = temp/10;


        }
        if (sum==num){

            System.out.println("Armstong Number");
        }
        else{
            System.out.println("Non-Armstrong Number");
        }
    }
}
