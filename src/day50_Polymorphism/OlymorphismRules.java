package day50_Polymorphism;


import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;
import day49_AbstractionPractice_Interface.Shapes.Cube;
import day49_AbstractionPractice_Interface.Shapes.Shape;

public class OlymorphismRules {

    public static void main(String[] args) {
        Dog dog = new Dog("Husky","black","sma","huskybeed",'f',2);
        dog.bark();
        Animal animal= new Dog("Husky","black","sma","huskybeed",'f',2);
        animal.eat("Dog food");


        Cube cube= new Cube(5);
        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        Shape shape = new Cube(5);
        System.out.println(shape.area());

    }
}
