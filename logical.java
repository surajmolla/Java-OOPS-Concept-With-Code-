package com.company;

import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        char word;
        System.out.println("Enter Your Word");
        word = Input.next().charAt(0);
        if(word>='a' && word>='z'){
            System.out.println("small");
        }
        else if (word>='A' && word >='Z'){
            System.out.println("Capital");
        }
        else{
            System.out.println("Not A Letter");
        }
    }
}
