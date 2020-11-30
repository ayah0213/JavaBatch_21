package day33_ArrayList;

import java.util.ArrayList;
public class ArrayslistIntro {
    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>(); // size 1
        scores.add(100); // autoboxing   0
        scores.add(90); // autobox  1
        scores.add(20); // autobox  2

        System.out.println(scores);

        ArrayList<String> grocceryList = new ArrayList<>(); // [ egg, water, bread,milk]
        grocceryList.add("Egg");
        grocceryList.add("Water");
        grocceryList.add("bread");
        grocceryList.add("milk");
        grocceryList.add(0,"Toilet pepper");
       grocceryList.add(1,"hand sanitizer");
       grocceryList.add(1,"Masks");

       System.out.println(grocceryList);

    }



}
