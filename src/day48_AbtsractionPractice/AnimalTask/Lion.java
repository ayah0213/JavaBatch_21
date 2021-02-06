package day48_AbtsractionPractice.AnimalTask;

public class Lion extends Animals implements Predator{

    public Lion(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void drink() {
        System.out.println("Lion drinks water");
    }

    @Override
    public void eat() {
        System.out.println("lions eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps 10 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts deer");
    }
}
