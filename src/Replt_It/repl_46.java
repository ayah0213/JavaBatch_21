package Replt_It;

import java.util.Scanner;

public class repl_46 {
    public static void main(String[] args) {

        /*
        The variable "num" holds an integer user input
Write a conditional statement starting on line 9 that does the following:

If num is positive, print "__ is positive"
If num is negative, print "__ is negative"
Examples:
In: 5
5 is positive
In: -2
-2 is negative
In: 0
(no output for zero)
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if (num>0){
            System.out.println(num+" is positive");
        }else if (num<0){
            System.out.println(num+" is negative");

        }else{
            System.out.println();
        }
    }
}
