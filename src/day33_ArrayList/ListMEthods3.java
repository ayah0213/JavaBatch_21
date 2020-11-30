package day33_ArrayList;

import java.util.ArrayList;

public class ListMEthods3 {

    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        // remove object from Index number
        list.remove(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);


        System.out.println("===========================================");

        // remove object from ArrayList
        ArrayList<Character> list2= new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        //Character ch ='C';
        list2.remove(Character.valueOf('C'));
        System.out.println(list2);


    }
}
