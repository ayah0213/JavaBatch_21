package day48_AbtsractionPractice.AnimalTask;

public class Shark extends Animals implements Predator, Swim{


    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps only 4 hr");
    }

    @Override
    public void eat() {
        System.out.println("Shark eats Human beings");
    }

    @Override
    public void drink() {
        System.out.println("Shark drinks Ocean water");
    }

    @Override
    public void hunt() {
        System.out.println("Sharks hunting for blood");
    }

    @Override
    public void swim() {
        System.out.println("Sharks re also can Swim");
    }
}
