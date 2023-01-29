package com.company;

public class TwoDArray {
    public static void main(String[] args) {
        int [] [] array =new int[2] [3];
        array[0] [0] =10;
        array[0] [1] =20;
        array [0] [2] =30;
        array [1] [0] =40;
        array [1] [1] =50;
        array [1] [2] =60;

        /*System.out.println(array[0] [0]);
        System.out.println(array[0] [1]);
        System.out.println(array [0] [2]);
        System.out.println(array [1] [0]);
        System.out.println(array [1] [1]);
        System.out.println(array [1] [2]);*/
        for (int row=0;row<2;row++){
            for (int col=0;col <=2;col++){
                System.out.print("  "+array [row] [col]);
            }

            System.out.println();

        }


    }
}
