package day50_Polymorphism;

import day48_AbtsractionPractice.AnimalTask.Animals;
import day48_AbtsractionPractice.AnimalTask.Dog;
import day48_AbtsractionPractice.AnimalTask.Dolphin;
import day48_AbtsractionPractice.AnimalTask.Eagle;

public class InstanceOfKeyword {
    public static void main(String[] args) {
        Animals animal = new Eagle("alabay","turkmen","small",'f',2);
        boolean isDog = animal instanceof Dog;
        boolean isDolphin= animal instanceof Dolphin;
        boolean isEagle = animal instanceof Eagle;
        boolean isAnimal = animal instanceof Animals;



        System.out.println("this is dog: "+ isDog);
        System.out.println("this is dolphin: "+isDolphin);
        System.out.println("is Animal: "+isAnimal);
        System.out.println("is eagle is :"+isEagle);

    }
}
