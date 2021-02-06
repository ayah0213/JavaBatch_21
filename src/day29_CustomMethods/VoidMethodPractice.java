package day29_CustomMethods;

import java.util.Arrays;

public class VoidMethodPractice {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 90, -9, -0, -1};
        maxNumber(a1);
        //minNumber(a1);
        minNumber(a1);
        int[] a2={2,-0,-8,-90,11,-12,45,3};
        maxNumber(a2);
        minNumber(a2);
        int[] a3 ={1,1,3,4,2,5,6,75,6,8};
        int[] a4 ={9,7,9,6,5,4,3};
        findUniqueElemet(a3);
        System.out.println();
        findUniqueElemet(a4);


    }

    public static void maxNumber(int[] arr) {
        //cheap way
//        Arrays.sort(arr);
//        System.out.println("Maximum number is: "+arr[arr.length-1]);

        int max = 0;
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Max number is: " + max);
    }
        public static void minNumber(int[] arrM){
            int min = 0;
            for (int each : arrM)
                if (each < min)
                    min = each;
            System.out.println("Min number is: "+min);
        }


        public static void findUniqueElemet(int[] arr) {

            for (int each : arr) {
                int count = 0;

                    for (int each2 : arr) {
                        if (each == each2) {
                            count++;
                        }
                    }
                    if (count==1)
                    System.out.println(each + " ");
            }
            System.out.println();


        }
    }

