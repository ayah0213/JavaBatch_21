package day29_CustomMethods;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
int[] arr={1,2,3,4,5};
addElements(arr,8);
        System.out.println("========================");
int[] a1={1,2,3,4,5};
int[] a2={9};
    }

    public static void addElements(int[] arr, int num){
        int [] result=new int[arr.length+1];
        for (int i = 0; i <= arr.length-1; i++) {
            result[i] = arr[i];
        }
        result[result.length-1]= num;
        System.out.println(Arrays.toString(result));
        }


        }


