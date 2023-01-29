package com.company;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = a&b ;
        System.out.println(c);
        c = a|b;
        System.out.println(c);
        c = a>>2;
        System.out.println(c);
        c= a<<3;
        System.out.println(c);
    }
}
