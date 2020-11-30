package day17_String_Memory;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {

        //  Write a programm that ask user to enter sentence
        // then print out the first and laast characters

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence= scan.nextLine();
        System.out.println("Your entered sentence was "+sentence);


    }
}
