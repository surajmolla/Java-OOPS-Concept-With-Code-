package com.company;

import java.util.Scanner;

public class PrimeNtoM {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int n,m ,count =  0 , totalprime = 0;

        System.out.println("Enter N Number:");
        n = Input.nextInt();
        System.out.println("Entewr M number:");
        m = Input.nextInt();

        for (int i=n;i<=m;i++){
            for (int j=2; j<=n;j++){
               if (i%j==0){
                   count++;
                   break;
               }
            }
            if (count==0 ){
                System.out.println(i);

                totalprime++;
            }
            count=0;
        }


        System.out.println("tptal prime number"+totalprime);
    }
}
