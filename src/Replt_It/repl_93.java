package Replt_It;

import java.util.Scanner;

public class repl_93 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean exists = false;

        if (word.substring(0).startsWith("java") || word.substring(1).startsWith("java")) {
            System.out.println("true");
        } else {
            System.out.println(exists);
        }

    }
}


        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
         such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
         */

