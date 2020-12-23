package day35_CustomClassContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    /*
      /*

    task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA


         */

    public static void main(String[] args) {

        String[] job={"QA","SDET","MANUAL TESTER","SDET","BUISNESS ANALYST","QA","SDET","QA","DEVELOPER","SCRUM MASTER","PO","CEO"};

        ArrayList<String> listJob =new ArrayList<>( );
        listJob.addAll(Arrays.asList(job));

        listJob.retainAll(Arrays.asList("SDET","QA"));
        System.out.println(listJob);
        System.out.println("================================");

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,89,-1,-2,-3,-4));

        // only keep the numbers 7.8.9
        numbers.retainAll(Arrays.asList(7,8,9));
        // numbers.removeIf( p-> (p=7 || p=8 || p=9) ); also we can use removeif
        System.out.println(numbers);
        System.out.println("=======================================");

        ArrayList<Integer> numbers2= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,89,-1,-2,-3,-4));

        // remove elements that re less than 7
        numbers2.removeIf(p-> p<7);
        System.out.println(numbers2);
        System.out.println("===============================");


           /*
         task04:
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
                solution 1: use lambda
                solution 2: do not use lambda
         */
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,200,100,300,400,150,120,800,780));

        // solution 1
//        list.removeIf(p-> p>100);

        // solution 2
        ArrayList<Integer> temp = new ArrayList<>();
        for (int each: list){
            if (each <= 100){
                temp.add(each);
            }
        }
        System.out.println(list);





















    }
}
