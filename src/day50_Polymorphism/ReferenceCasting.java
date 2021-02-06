package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day47_AbstractionIntro.Shapes.Circle;
import day47_AbstractionIntro.Shapes.Shape;
import day49_AbstractionPractice_Interface.RemoteDriver.ChromeDriver;
import day49_AbstractionPractice_Interface.RemoteDriver.WebDriver;

public class ReferenceCasting {
    public static void main(String[] args) {
        // implicit casting
        int a =10;
        double b= a;

        // explicit casting
        double d =10.5;
        int c=(int)d;

        System.out.println("====================================");
        // implicit casting= Up-casting
        Circle circle = new Circle(3);
        Shape shape=circle;


        // upcasting
        WebDriver driver =new ChromeDriver();

        // down casting: larger reference type to the smaller
        Animal animal=  new Dog("Husky","black","sma","huskybeed",'f',2);
        Dog dog = (Dog)animal;
        dog.bark();

        Animal animal2 =new Cat("inci","black","sma","beed",'f',2);
        ((Cat) animal2).meow();

        System.out.println("===================================================");
    }
}
