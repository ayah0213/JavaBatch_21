package day48_AbtsractionPractice.AnimalTask;

public class Dog extends Animals implements HomeAnimal{

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog likes to eat dog-food");
    }

    @Override
    public void drink() {
        System.out.println("Dog likes to drink beer");
    }

    @Override
    public void sleep() {
        System.out.println("Dog likes to sleep 18hr");
    }

    @Override
    public void livesAthome() {
        System.out.println("Dog is Home animal");
    }
}
