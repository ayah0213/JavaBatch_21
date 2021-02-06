package day48_AbtsractionPractice.AnimalTask;

public class Cat extends Animals implements HomeAnimal{


    public Cat(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleeps more than 10 hr");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats cat-food");
    }

    @Override
    public void drink() {
        System.out.println("Cta drinks a lot of milk for cat");
    }

    @Override
    public void livesAthome() {
        System.out.println("Cat lives with people");
    }
}
