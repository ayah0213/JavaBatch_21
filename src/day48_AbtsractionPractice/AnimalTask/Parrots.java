package day48_AbtsractionPractice.AnimalTask;

public class Parrots extends Animals implements Flyable,HomeAnimal{

    public Parrots(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("PArrots sleep about 12 hours");
    }

    @Override
    public void eat() {
        System.out.println("PArrot eats Parrot-food");
    }

    @Override
    public void drink() {
        System.out.println("Parrot drinks tea");
    }

    @Override
    public void fly() {
        System.out.println("Parrots are able to FLy");
    }

    @Override
    public void livesAthome() {
        System.out.println("Parrot also lives at home");
    }
}
