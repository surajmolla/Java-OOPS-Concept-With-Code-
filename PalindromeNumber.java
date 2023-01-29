package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int sum=0,temp,r,num;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Digit:");
        num = Input.nextInt();
        temp = num;

        while (temp!=0){

            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;

        }
        if (num == sum){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not-Palindrome");
        }

    }
}
