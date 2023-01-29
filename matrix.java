package com.company;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Array[] [] = new int [3] [3];
        System.out.println("Enter Your Number");
        int sum = 0;
        //matrix input ;
        for ( int row = 0; row<3;row++){
            for ( int col = 0;col<3;col++){
                 Array [row] [col] =  Input.nextInt();

            }

        }
 // diagonal ,upper,lower
        for ( int row = 0; row<3;row++){
            for ( int col = 0;col<3;col++){
               if (row==col){
                   sum = sum+ Array[row] [col];
               }
               if (row<col){
                   sum =sum+Array[row] [col];
                   System.out.println();
               }
               if (row>col){
                   sum =sum+Array [row] [col];
               }
            }

        }
        System.out.println("Sum of all matrix "+sum);
        System.out.println("upper element of matrix:"+sum);
        System.out.println("Lower element of matrix :"+sum);

    }
}
