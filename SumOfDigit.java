package com.company;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int sum=0,num,r,temp;

        System.out.println("Enter Your Digit:: ");
        num = Input.nextInt();
        temp =num;

        while (temp!=0){
            r =temp%10;
            sum=sum+r;
            temp = temp/10;
            System.out.println(sum);

        }
        System.out.println("Numer of digit"+sum);





    }
}
