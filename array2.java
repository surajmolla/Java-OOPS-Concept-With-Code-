package com.company;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] newarray;
        newarray = new int[6];
        int sum = 0;

       /* newarray[0] = Input.nextInt();
        newarray[1] = Input.nextInt();
        newarray[2] = Input.nextInt();
        newarray[3] =Input.nextInt();
        newarray[4] = Input.nextInt();
        newarray[5] = Input.nextInt();
        int sum = newarray[0] + newarray[1] +newarray[2] + newarray[3] + newarray[4] + newarray[5];
    System.out.println(sum);
    int lenth = newarray.length;
    System.out.println( "lenth of array is:"+lenth);*/

        System.out.println("Please enter 5 number:");
        for (int i = 0; i <= 5; i++) {
            newarray[i] = Input.nextInt();
        }
        for
        (int i = 0; i < 5; i++) {
            sum = sum+newarray[i];

        }
        System.out.println("sum is " + sum);
        System.out.println("avg" + sum / 6);

        int min =newarray[0];
        int max = newarray[0];
        for ( int i=1;i<6;i++){
            if (min>newarray[0]){
               min = newarray[i];

            }
            if (max<newarray[0]){
                max =newarray[i];

            }

        }
        System.out.println( "min"+min);
        System.out.println( "max"+max);

    }
}

