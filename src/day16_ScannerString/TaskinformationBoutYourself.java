package day16_ScannerString;

import java.util.Scanner;

public class TaskinformationBoutYourself {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Whats your first name?");
        String firstNAme=scan.next();

        System.out.println("what is your last name?");
        String lastName=scan.next();

        System.out.println("Re u employed?");
        Boolean isemplyed=scan.nextBoolean();

        double salary=0;

        if (isemplyed==true){
            System.out.println("What is your salary");
            salary=scan.nextDouble();

        }
        System.out.println("Full name: "+firstNAme+" "+lastName);
        System.out.println("Employed : "+ isemplyed);
        System.out.println("Salary: "+salary);


    }
}
