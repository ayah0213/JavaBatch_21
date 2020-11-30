package day31_MethodOverloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodOverloading5 {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 3.5, 2.5, 0.75};
        double[] arr2 = {2.5, 3.75, 1.25};
        double[] arr3 = {9.75, 1.25, 2.15};
        double[] arr4 = {7.5, 0.75, 1.25};

        double[] arr5 = combineTwoArrays(combineTwoArrays(arr1, arr2), combineTwoArrays(arr3, arr4));

        System.out.println(Arrays.toString(arr5));

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8};
        int[] a3 = {9, 10, 11};
        int[] a4 = combineTwoArrays(combineTwoArrays(a1, a2), a3); // combine all arrays in 1 =4
        System.out.println(Arrays.toString(a4));


        String[] group14 = {"Diana", "Sevara", "Yalcin", "Muhtar", "Serdar", "Ayjeren"};
        String[] group3 = {"Asel", "Rauf", "Ibrahim", "Erhan", "Halil", "Hanieh", "Ruzanna", "Jiamila", "Jimell", "Sofia", "Yilihamu", "Nueraihemaiti"};
        String[] group5 = {"Maryam", "Hurshid", "Duane", "Halisa", "Alimu"};
        String[] group31 = {"Livio", "Steph", "Dan", "Sobir", "Atala", "Yusef", "Saafir"};
        String[] group30 = {"Halzat", "Serhii", "Karlygash", "Polina", "Aisha"};
        String[] group4 = {"Sevara", "Saltanat", "Volkan", "Muhammad", "Angelina", "Ayah",
                "Slobodan", "Zahar", "Serdar", "Diana"};

        String[] group14And3=combineTwoArrays(group14,group3);
        String[] group5And31=combineTwoArrays(group5, group31);
        String[] group30And4=combineTwoArrays(group30, group4);

        String[] cybertekStudents=combineTwoArrays(combineTwoArrays(group14And3, group5And31),group30And4);

        // another shot way of Combining all in 1 shot
//        String[] CybertekStudents = combineTwoArrays(combineTwoArrays(group14, group3),
//                combineTwoArrays(group5, group31), combineTwoArrays(group30, group4);
        System.out.println(Arrays.toString(cybertekStudents));


    }
    public static int[] combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static double[] combineTwoArrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];
        int i = 0;

        for(double each : arr1){
            arr3[i++] = each;
        }

        for(double each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static String[] combineTwoArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];
        int i = 0;

        for(String each : arr1){
            arr3[i++] = each;
        }

        for(String each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }
}
