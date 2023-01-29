package com.company;

public class array {
    public static void main(String[] args) {
        int []array1;
        array1 = new int[10];
        array1[0]=20;
       array1[1]=30;
        array1[2]=30;
        array1[3]=30;
        array1[4]=30;
        array1[5]=30;
        array1[6]=30;
        array1[7]=30;
        array1[8]=30;
        array1[9]=30;
        int sum = array1[0]+array1[1]+array1[2]+array1[3]+ array1[4]+ array1[5] +array1[6]+ array1[7] +array1[8]+array1[9];
        System.out.println(sum);
         int lenth =  array1.length;
        System.out.println("the lenth of array is "+lenth);


    }
}
