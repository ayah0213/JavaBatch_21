package day17_String_Memory;

import java.util.Scanner;

public class ScannerTAsk3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter First name and last names");
        // print out first Letters of initials

        String fName=scan.nextLine();
        System.out.println("Print last name");
        String lastName=scan.nextLine();

        System.out.println("1st letters of your initials are :"+fName.charAt(0)+lastName.charAt(0));

    }
}
