package day17_String_Memory;

import java.util.Scanner;

public class ScannnerTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("what is your Frst name?");
        String fName=scan.nextLine();
        System.out.println("what is your last name?");
        String lastName=scan.nextLine();
        System.out.println("Your inputs are: "+fName+" "+lastName);
    }
}
