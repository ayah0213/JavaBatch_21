package day16_ScannerString;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("please enter your salary");
        double salary=scan.nextDouble(); // 85.000

        System.out.println("How many hours you work in a week?");// 40
         int hours=scan.nextInt();

         double hourlyRate=salary/(hours*52);
        System.out.println("Your hpurly rate is "+hourlyRate);


    }
}
