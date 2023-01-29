package com.company;

public class ArratMatrix2 {
    public static void main(String[] args) {

        //int matrixA[] [] = new int [2][3];
        int matrixA[][] =  new int  [3][3];
        matrixA [0] [0]=1;
        matrixA [0] [1]=2;
        matrixA [0] [2]=3;
        matrixA [1] [0]=4;
        matrixA [1] [1]=5;
        matrixA [1] [2]=6;
        matrixA [2] [0]=7;
        matrixA [2] [1]=8;
        matrixA [2] [2]=9;


        int sum = 0;


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                sum = sum + matrixA[row][col];
            }

        }
        System.out.println(sum);


            System.out.println(" avg" + sum / 9);

        /*matrixA [0] [0] = 10;
        matrixA [0] [1] = 20;
        matrixA [0] [2] =30;
        matrixA [1] [0] =40;
        matrixA [1] [1] =50;
        matrixA [1] [2] = 60;*/

            //int sum = matrixA [0] [0] + matrixA [0] [1] + matrixA [0] [2] + matrixA [1] [0] + matrixA [1] [1]
            //+ matrixA [1] [2];



    }
}
