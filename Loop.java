package com.company;

import jdk.nashorn.internal.ir.ContinueNode;

public class Loop {
    public static void main(String[] args) {
        int sum  =10;
        for ( int i=1;i <=50;i++){
            if (i==45) {
                break;
            }
            System.out.println(sum+"x"+i+"="+sum*i);
            if (i>=46)
                continue;
        }
    }
}
