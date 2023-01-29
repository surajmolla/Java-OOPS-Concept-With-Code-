package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter ANy Postive Integer");
        int num;
        int count = 0;
        num = Input.nextInt();
        for ( int i=2; i<num;i++){
            if (num % i == 0){
                count++;

                System.out.println("Non-Prime Number");
                break;

            }
            else{
                System.out.println("Prime Number");
                break;
            }

        }
    }
}
