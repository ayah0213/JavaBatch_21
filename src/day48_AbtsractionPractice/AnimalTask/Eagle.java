package day48_AbtsractionPractice.AnimalTask;

public class Eagle extends Animals implements Predator, Flyable{

    public Eagle(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);



    }
    @Override
    public void sleep() {
        System.out.println("Eagle sleeps 3-4 hours");
    }

    @Override
    public void eat() {
        System.out.println("Eagle like to eat small animals by catching them");
    }

    @Override
    public void drink() {
        System.out.println("Eagle drinks Water");
    }

    @Override
    public void fly() {
        System.out.println("Eagle its a bird that can also FLy");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts Rabbit");
    }
}

