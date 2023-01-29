package com.company;

import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int [] [] arrayone = new  int [2] [3];
        int [] [] arraytwo = new int [2] [3];

        System.out.println("Enter Value for arrayone:");
        for (int row=0;row <2;row++){//arrayone for input
            for (int col=0;col<3;col++){
                System.out.printf("arrayone [%d] [%d] =" ,row,col);
                arrayone [row] [col] = Input.nextInt();

            }
        }
        System.out.println("Enter Value For Arraytwo:");
        for (int row=0;row <2;row++){//arraytwo for input
            for (int col=0;col<3;col++){
                System.out.printf("arraytwo [%d] [%d]=", row,col);
                arraytwo [row] [col] = Input.nextInt();

            }
            System.out.println();
        }


        System.out.println(" for arrayone");//for printing arrayone output
        for (int row=0;row <2;row++){
            for (int col=0;col<3;col++){
                System.out.print("          "+arrayone [row] [col]);


            }
            System.out.println();
        }

        System.out.println(" for arraytwo");//for printing arraytwo output
        for (int row=0;row <2;row++){
            for (int col=0;col<3;col++){
                System.out.print("          "+arraytwo [row] [col]);


            }
            System.out.println();
        }

    }
}
