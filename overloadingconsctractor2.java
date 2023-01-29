package com.oop;

public class overloadingconsctractor2 {
    public static void main(String[] args) {
        overloadingconstractor newclass = new overloadingconstractor();
        newclass.printingmethod();
        System.out.println();

        overloadingconstractor newclass2 = new overloadingconstractor("anisul","julekha");
        newclass2.printingmethod();
        System.out.println();

        overloadingconstractor newclass3 = new overloadingconstractor("suraj","julekha",1112121);
        newclass3.printingmethod();
    }
}
