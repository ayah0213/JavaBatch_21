package day29_CustomMethods;

import java.util.Arrays;

public class ArrayMaxMinPracticeMEthods {

    public static void main(String[] args) {


    }

    public static void maxNumArray(int[] array) {

        int[] num = {-1, -0, -9, 12, 13, 43, 67, 5, 7};
        int maxValue = num[0];
        int minValue = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxValue) {
                maxValue = num[i];

            } else if (num[i] < minValue) {
                    minValue = num[i];
                }
            }

        System.out.println(Arrays.toString(num));
        System.out.println("Maxx number is: "+maxValue);
        System.out.println("Min number is: "+minValue);
        }
    }
