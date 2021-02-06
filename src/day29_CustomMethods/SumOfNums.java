package day29_CustomMethods;

import java.util.Scanner;

public class SumOfNums {


    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Please eneter 3 numbers");

        sumNum(20, 33, 987);
        //sumNum(scan.nextInt(), scan.nextInt(), scan.nextInt());
        greaterNum(23, -23);
        greaterNum(33,33);
    }

    public static void sumNum(int n1, int n2, int n3) {
        System.out.println("Sum of 3 nums is: " + (n1 + n2 + n3));
    }

    public static void greaterNum(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1);
        } else if (n1 < n2) {
            System.out.println(n2);

        } else {
            System.out.println("they re equall");
        }
    }
}
