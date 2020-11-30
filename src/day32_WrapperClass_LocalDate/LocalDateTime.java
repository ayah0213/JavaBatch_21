package day32_WrapperClass_LocalDate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LocalDateTime {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        arr = addElements(arr, 7);
        System.out.println(Arrays.toString(arr));


        double[] arr2 = {1.2, 2.3, 3.4};
        arr2 = addElements(arr2, 8.7);
        System.out.println(Arrays.toString(arr2));


        char[] arr3 ={'c','v','a','b'};
        arr3=addElements(arr3,'M');
        System.out.println(Arrays.toString(arr3));


        String[] arr4 ={"Ayah","Maya","Zoya","Sonya"};
        arr4=addElements(arr4,"Muhtar");
    }
    /*
    warmup task:
    1. create a return method called addElements that can add an Inteeger  after the  last index of an integer array
    2. create a return method called addElements that can add a double after the last index of a double array
    3. create a return method called addElements that can add a String after the last index of a String array
    4. create a return method called addElements that can add a char after last index of a char array

     */

    public static int[] addElements(int[] array, int number){
        int[] result =new int[array.length+1];
        for (int i=0; i<=array.length-1; i++){
           result[i] = array[i];
        }

        result[result.length-1]=number;


        return result;
    }

    public static double[] addElements(double[] array, double number){
        double[] result =new double[array.length+1];
        for (int i=0; i<=array.length-1; i++){
            result[i] = array[i];
        }

        result[result.length-1]=number;


        return result;
    }


    public static char[] addElements(char[] array, char number){
        char[] result =new char[array.length+1];
        for (int i=0; i<=array.length-1; i++){
            result[i] = array[i];
        }

        result[result.length-1]=number;


        return result;
    }

    public static String[] addElements(String[] array, String number){
        String[] result =new String[array.length+1];
        for (int i=0; i<=array.length-1; i++){
            result[i] = array[i];
        }

        result[result.length-1]=number;


        return result;
    }



}
