package day25_Array_Intro;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String[] months = {"January","February","March","April","May","June","July","August","Sept","October","NOve","Decem"};

        System.out.println("enter number of months please");
        int num = scan.nextInt();
        System.out.println(months[num-1]);



    }
}
