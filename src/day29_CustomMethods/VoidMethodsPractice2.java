package day29_CustomMethods;

public class VoidMethodsPractice2 {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        char c = '*';
        calculator(a, b, c);
    }

    public static void calculator(int a, int b, char c) {
        if (c == '+') {
            System.out.println(a + b);
        } else if (c == '-') {
            System.out.println(a - b);
        } else if (c == '*') {
            System.out.println(a * b);
        } else if (c == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Invalid character enetered");
        }
    }
}

