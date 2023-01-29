package com.company;

public class stingpalindrom {
    public static void main(String[] args) {

        String s1 = "University";
        StringBuffer sb = new StringBuffer(s1);
         String s2 = sb.reverse().toString();
         if (s1.equals(s2)){
             System.out.println("palindrom");
         }else{
             System.out.println("not palindrom");
         }


    }
}
