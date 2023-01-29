package com.company;

public class string {
    public static void main(String[] args) {
       /*
       String fname = "Suraj";
        String sname = "molla";
        String fullname = fname+sname;
        System.out.println(fullname);

        */

        String fname = " i @am@ a@ good@ boy";
        String sname = "molla";
        String fullname = fname.concat(sname);
        System.out.println(fullname);

        String  s3  = fname.replace('i','j');
        System.out.println(fname);
        String [] s4 = fname.split("@");
        for ( String x:s4){
            System.out.println(x);

        }



        String uppername = fullname.toUpperCase();
        System.out.println(uppername);
        String lowername = fullname.toLowerCase();
        System.out.println(lowername);

        boolean b  = fname.startsWith("s");
        System.out.println(b);
        boolean c = sname.startsWith("sjkfdfk");
        System.out.println(c);
        boolean last = sname.endsWith("j");
        System.out.println(last);






    }
}
