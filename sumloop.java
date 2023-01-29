package com.company;

public class sumloop {

    public static void main(String[] args) {
        int sum = 0;

        int i;
        for (i = 30; i <= 120; i++)
            if (i % 3 == 0 && i % 5 == 0) sum = sum + i;
        System.out.println(sum + i);

    }
}
