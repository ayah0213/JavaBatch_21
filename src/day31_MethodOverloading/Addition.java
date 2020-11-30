package day31_MethodOverloading;

public class Addition {

    public static void main(String[] args) {
        System.out.println(additionOf2Numbers(100,200));
        System.out.println(additionOf3Numbers(100,200,300));
        System.out.println(additionOf4Numbers(100,200,300,400));
    }
    public static int additionOf2Numbers(int a , int b){
        return a+b;
    }

    public static int additionOf3Numbers(int a, int b, int c){
        return a+b+c;
    }

    public static int additionOf4Numbers(int a, int b, int c,int d){
        return a+b+c+d;
    }
    /*

    Task2:
        1. create a method that can find the addition of two numbers
                    method name: additionOf2Numbers
        2. create a method that can find the addition of three numbers
                    method name: additionOf3Numbers
        3. create a method that can find the addition of four numbers
                    method name: additionOf4Numbers

     */
}
