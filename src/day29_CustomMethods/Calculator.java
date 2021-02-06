package day29_CustomMethods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please eneter your input");
        calculator(scan.nextInt(), scan.next().charAt(0), scan.nextDouble());
        System.out.println();

calculator(23,'+',23.5);
;

    }


    public static void calculator(int n1, char operator, double n2){
        boolean isValid = operator == '+' ||operator=='-'||operator=='/'||operator=='*';

        if (isValid){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
                default:
                    System.out.println("Remainder: "+(n1%n2));
            }
        }else {
            System.out.println("Invalid operator");
        }
    }
}
