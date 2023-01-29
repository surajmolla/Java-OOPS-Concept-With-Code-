package  com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Switch2 {
    public static void main(String[] args) {
        int month;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Number Where JAN=1 TO DERC=12");
        month = Input.nextInt();
        switch (month){

            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
                case 12:


                System.out.println(" he Month Is 31");
                break;
            case 2:
                System.out.println("This Have Only 28 or 29");
                break;
            case 4:
            case 6:
            case 8:
            case 11:
                System.out.println("This Have 30 Day");
                break;
            default:
                System.out.println("Invalid Number Pz Enter 1 to 12 Int");
                break;

        }

    }
}

