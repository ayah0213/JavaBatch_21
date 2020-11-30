package day17_String_Memory;

import java.util.Scanner;

public class SwitchStatementScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("pick a number from 1-10");
        byte num=scan.nextByte();


        if (num> 0 && num<11){

            System.out.println("Can u enter that number as a word");
            String word=scan.next();// accept one words only
            boolean areMAtching=false;

        switch (word){
            case "one":
                areMAtching=(num==1);
                break;
            case "two":
                areMAtching=(num==2);
                break;
            case "three":
                areMAtching=(num==2);
                break;
            case "four":
                areMAtching=(num==4);
                break;
        }
        if (areMAtching){
            System.out.println("Number: "+num);
            System.out.println("Word: "+word);
        }else {
            System.out.println("The two inputs do not match");
        }
    }else {
            System.out.println(num+" was not between 1-10");
        }
        scan.close();

    }
}
