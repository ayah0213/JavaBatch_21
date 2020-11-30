package day31_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        method1();
        method1();


        System.out.println("=========================");

        int[] arr1 ={3,4,5};
        Arrays.sort(arr1);

        double[] arr2={2.5,5.5, 3.45};
        Arrays.sort(arr2);

        char[] arr3 ={'a','c','b'};
        Arrays.sort(arr3);

        String[] arr4 ={"A","C","B"};
        Arrays.sort(arr4);
    }


    public static  void method1(){
        System.out.println("A");
    }

    public static void method1(int a){
        System.out.println("B");

    }

    public static void method1(String b){
        System.out.println("C");
    }

    public static void method1(int a, String b){
        System.out.println("D");
    }

    public static void  method1(double a){
        System.out.println("E");
    }
}
