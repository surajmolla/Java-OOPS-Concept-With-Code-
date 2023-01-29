package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Revarsenumber {
    public static void main(String[] args) {


      int r ,sum=0,num;
      Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        num=Input.nextInt();
        int temp=num;

        while (temp!=0){
             r = temp%10;
             sum = sum*10+r;
             temp = temp/10;

        }
        System.out.println("The Revesre Number Of Your Digit: "+ sum);

    }
}
