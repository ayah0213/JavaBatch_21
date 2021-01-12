package day25_Array_Intro;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String[] days={"Mon","Tues","Wedns","Thurs","Frid","Sat","Sun"};
        System.out.println("please enter a number of teh weekday");
        int weekDAy= scan.nextInt();

        System.out.println("today is :"+ days[weekDAy-1]);
    }
}
