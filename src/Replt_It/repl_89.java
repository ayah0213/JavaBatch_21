package Replt_It;

import java.util.Scanner;

public class repl_89 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word= scan.next();

        int chCount = word.length();

        // There are 3 ways of doing this task

       // 1) System.out.println(word.charAt(0)+""+word.charAt(chCount-1));
        // 2) System.out.println(word.substring(0,1)+ word.substring(chCount-1));
        // 3)
        char first = word.charAt(0);
        char last =  word.charAt(word.length() - 1);
        System.out.println(first+""+last);




        /*
        Write a program that will print out first and last letters together.
                  adobe
                  ae
                 */
    }
}
