package day16_ScannerString;

import java.util.Scanner;

public class DynamicCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1=scan.nextInt();

        System.out.println("ENter a number 2");
        int num2=scan.nextInt();

        System.out.println("Enter an operator");
        String operator=scan.next();

        scan.close();

        int result=0;
        boolean isvalid=true;

        switch (operator){
            case "+":
                result=num1+num2;
                break;
            case"-":
                result=num1-num2;
                break;
            case"/":
                result=num1/num2;
                break;
            case"%":
                result=num1%num2;
                break;
            default:
               isvalid=false;
        }
        if (isvalid) {
            System.out.println(num1 + operator + num2 + "=" + result);

        }else {
            System.out.println(operator+ " is invalid operator");
        }
    }
}
