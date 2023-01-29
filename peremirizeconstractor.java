package com.oop;

public class peremirizeconstractor {
    public static void main(String[] args) {
        defaultconstractor newclass =  new defaultconstractor("suraj","julekha",115515);
        newclass.printing();

        defaultconstractor newclass2 = new defaultconstractor();
        newclass2.printing();
    }
}
