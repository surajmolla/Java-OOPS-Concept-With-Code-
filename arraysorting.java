package com.company;

import java.util.Arrays;

public class arraysorting {
    public static void main(String[] args) {
        int array [] = {10,40,20,-50,6};
        Arrays.sort(array);
        for ( int i=0;i<5; i++){
            System.out.print("   "+array[i]);

        }
        System.out.println();
        for (int i =4;i>=0;i--){
            System.out.print("  "+array[i]);
        }
        System.out.println();
        //string sorting
        String arrayst[] = {"suraj","sakib","kutub","julekha"};
        Arrays.sort(arrayst);

        for ( int s=0;s<4; s++){
            System.out.println("  "+array[s]);
        }
        for (int s=3;s>=0;s--){
            System.out.println(array[s]);
        }
    }
}
