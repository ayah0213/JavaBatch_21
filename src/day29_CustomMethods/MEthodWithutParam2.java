package day29_CustomMethods;

import java.util.Scanner;

public class MEthodWithutParam2 {

    public static void main(String[] args) {
        System.out.println("All odd numbers");
       printOddNum1to100();
        System.out.println("Now print out all even numbers");
        printEvennumber1to100();
    }

    public static void printOddNum1to100(){
        for (int i = 1; i <=100; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void printEvennumber1to100(){
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }



}
