package Replt_It;

import java.util.Scanner;

public class repl_44 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        if (age==1){
            System.out.println("Ineligible");
        }else if (age==2){
            System.out.println("Toddler");
        }else if (age<=5){
            System.out.println("early childhood");
        }else if (age<=7){
            System.out.println("young reader");
        }else if (age<=10){
            System.out.println("elementary");
        }else if (age==13 ){
            System.out.println("Impossible");
        }else if (age<=16){
            System.out.println("high school");
        }else if (age <= 18){
            System.out.println("scholar");
        }else {
            System.out.println("ineligible");
        }


    }
}
