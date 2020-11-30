package day17_String_Memory;

import java.util.Scanner;

public class StringScannerTask6 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ENter 2 letter word");
        String word= scan.next();

        if (word.length()==3) {

            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Not a cool word");
            }
        }else {
            if (word.length() < 3){
                System.out.println("word is too short");
            }else {
                System.out.println("Word is too long");
            }
        }

    }
}
