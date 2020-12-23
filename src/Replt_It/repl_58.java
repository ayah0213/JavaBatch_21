package Replt_It;

import java.util.Scanner;

public class repl_58 {
    /*
    CAlendar
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();


        switch (monthNum){
            case 1:
                monthNum=1;
                System.out.println("January");
                break;
            case 2:
                monthNum=2;
                System.out.println("Februrary");
                break;
            case 3:
                monthNum=3;
                System.out.println("March");
                break;
            case 4:
                monthNum=4;
                System.out.println("April");
                break;
            case 5:
                monthNum=5;
                System.out.println("May");
                break;
            case 6:
                monthNum=6;
                System.out.println("June");
                break;
            case 7:
                monthNum=7;
                System.out.println("July");
                break;
            case 8:
                monthNum=8;
                System.out.println("August");
                break;
            case 9:
                monthNum=9;
                System.out.println("September");
                break;
            case 10:
                monthNum=10;
                System.out.println("October");
                break;
            case 11:
                monthNum=11;
                System.out.println("November");
                break;
            case 12:
                monthNum=12;
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}
