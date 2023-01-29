package com.company;

import java.util.Scanner;

public class staire {
    public static int findStep(int n)

    {
        if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;

        else
            return findStep(n - 3) + findStep(n - 2)
                    + findStep(n - 1);
    }
    public static void main(String[] args) {
        int n ;
        Scanner Input = new Scanner(System.in);
        System.out.println("Entter Your Number ");
        n = Input.nextInt();
        System.out.println(findStep(n));
    }
}
