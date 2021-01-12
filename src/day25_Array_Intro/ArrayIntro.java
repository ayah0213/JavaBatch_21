package day25_Array_Intro;

public class ArrayIntro {

    public static void main(String[] args) {

        String[] names = {"Cybertek","Azad","Ayse","Inna","Erjon","Aysel","Mustafa","Marwan"};

        System.out.println(names[3]);
        String str= names[1];
        System.out.println(str);

        int[] score={80,85,90,70,75,78,99,89};

        System.out.println(names[2]+" score is:"+score[2]);
        System.out.println(names[4]+" score is :"+score[4]);
        System.out.println("====================================================");

        for (int i = 0; i <= names.length-1; i++) {
            System.out.println(names[i]+"-"+score[i]);
        }





    }
}
