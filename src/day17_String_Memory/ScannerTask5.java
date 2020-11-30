package day17_String_Memory;

import java.util.Scanner;

public class ScannerTask5 {
    public static void main(String[] args) {

        // ask user to enter two words then add them together and print ex: one+eight=oneeigh

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 words ");
        String word1=scan.nextLine();
        String word2= scan.nextLine();
        System.out.println("Yur two words are: "+word1.concat(word2));
    }
}
