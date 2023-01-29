package com.company;

public class array7 {
    public static void main(String[] args) {
        int array [] [] =new int [4] [];
        int k= 0;
        array[0]=  new int [1];
        array[1]=new int [2];
        array[2] =new int [3];
        array[3] =new int [4];
        for ( int i=0;i<4;i++){
            for (int j=0;j==i+1;j++){
                array [i] [j] = k;
                k++;

            }
        }
        for ( int i=0;i<4;i++){
            for (int j= 0;j==j+1;j++){
                System.out.print(array [i] [j]);
            }
            System.out.println();
        }
    }

}
