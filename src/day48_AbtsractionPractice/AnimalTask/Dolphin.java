package day48_AbtsractionPractice.AnimalTask;

public class Dolphin extends Animals implements Swim {


    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphins never sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eats fish shell");
    }

    @Override
    public void drink() {
        System.out.println("Dolphin drinks Se water");
    }

    @Override
    public void swim() {
        System.out.println("Dolphins can swim");
    }
}
