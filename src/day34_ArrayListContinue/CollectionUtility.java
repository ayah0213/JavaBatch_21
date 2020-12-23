package day34_ArrayListContinue;

import java.util.ArrayList;

import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('X');
        chars.add('Y');
        chars.add('Z');
        chars.add('W');
        chars.add('A');
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println("chars = " + chars);

        ArrayList<Integer> scores= new ArrayList<>();
        scores.add(70);
        scores.add(80);
        scores.add(25);
        scores.add(50);
        scores.add(50);
        scores.add(60);
        scores.add(70);

        Collections.sort(scores);
        System.out.println(scores);
        System.out.println("Minimum number: "+scores.get(0));
        System.out.println("Max number:"+scores.get(scores.size()-1));
        System.out.println(scores);
        Collections.swap(scores,2,3);
        System.out.println(scores);

        Collections.swap(scores, 0, scores.size()-1);
        System.out.println(scores);

        Collections.swap(scores, scores.indexOf(60), scores.lastIndexOf(70));
        System.out.println(scores);

        System.out.println("=========================================");

        ArrayList<Character> ch= new ArrayList<>();
        ch.add('A');
        ch.add('c');
        ch.add('d');
        ch.add('A');
        ch.add('e');
        ch.add('A');
        ch.add('b');

        // bu ysing for loop
//
//        for (int i = 0; i <ch.size()-1 ; i++) {
//            char each = ch.get(i);
//            if (each == 'A'){
//                ch.set(i, 'E');
//            }
//        }
//        System.out.println(ch);


        // by using Collections
        Collections.replaceAll(ch,'A','E');
        System.out.println(ch);

        int frequncyofE = Collections.frequency(ch, 'E' );
        System.out.println("frequncyofE = " + frequncyofE);




    }
}
