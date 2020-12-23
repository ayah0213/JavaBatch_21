package OfficeHours.Practice_12_02_2020;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','b','a','a','c','d','#','%'));

        list.removeAll(Arrays.asList('a')); // remove all A from array list

        System.out.println(list);

        list.retainAll(Arrays.asList('C','B')); // remove all except C and B

        System.out.println(list);

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(95,25,45,12,45,14,36,42));
        numbers.removeIf( p -> p < 75  );

        System.out.println(numbers);



    }



}
/*
		removeAll:
		retainAll:
		removeIf:
		remover(): cannot be used inside loop with out Iterable
 */
