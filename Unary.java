package com.company;

public class Unary {
    public static void main(String[] args) {
        int x = 10;
        int result;
        result = ++x;//prefix increment
        System.out.println(+result);
        result = -x;//prefix decrement
        System.out.println(+result);
        result = x++;
        System.out.println(result++);
    }
}
