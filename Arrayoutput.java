package com.company;

import java.util.Scanner;

public class Arrayoutput {
    public static void main(String[] args) {
        int array[] []=  new int [4] [5];
        int k = 0;
        for ( int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                array [i] [j] = k;
                k++;
            }

        }
        for ( int row = 0; row<4;row++){
            for (int col = 0;col<5;col++){
                System.out.print( "  "+array[row] [col]);
            }
            System.out.println();
        }
    }
}
