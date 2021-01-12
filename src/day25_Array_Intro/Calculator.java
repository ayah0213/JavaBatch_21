package day25_Array_Intro;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter your number");
            double n1 = scan.nextDouble();
            System.out.println("Math operator: ");
            char o = scan.next().charAt(0);
            System.out.println("Enter num 2: ");
            double n2 = scan.nextDouble();
            switch (o) {
                case '+':
                    System.out.println("Addition " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("Multiplication " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division " + (n1 / n2));
                    break;
                default:
                    System.out.println("Invalid character!");
            }
            System.out.println("Would u like to continue");
            String a = scan.next().toLowerCase();
            while (!a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no")) {
                System.out.println("Invalid answer, please renter");
                System.out.println("Please neter number");
                a = scan.next().toLowerCase();
            }

            if (a.equalsIgnoreCase("no")) {
                break;
            }

        }
    }
}