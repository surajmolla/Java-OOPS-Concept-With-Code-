package com.company;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        System.out.println("Enter Your number:");
        int n = Input.nextInt();
        for(int row = n;row >=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(col);

            }
            System.out.println();
        }

    }
}
