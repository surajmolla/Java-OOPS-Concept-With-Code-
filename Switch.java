package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int word;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        word = Input.nextInt();
        switch (word) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Zero1");
                break;

            case 2:
                System.out.println("Zero2");
                break;

            case 3:
                System.out.println("Zero3");
            case 4:
                System.out.println("Zero4");
            case 5:
                System.out.println("Zero5");
            case 6:
                System.out.println("Zero6");
            case 7:
                System.out.println("Zero7");
            case 8:
                System.out.println("Zero8");
                break;
            default:
                System.out.println("not a digit" );



        }
    }
}
