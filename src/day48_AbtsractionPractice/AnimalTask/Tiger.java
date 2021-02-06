package day48_AbtsractionPractice.AnimalTask;

public class Tiger extends Animals implements Predator{
    public Tiger(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps about 8hours");
    }

    @Override
    public void eat() {
        System.out.println("Tiger likes to eats freshly ciutted meat");
    }

    @Override
    public void drink() {
        System.out.println("Tiger likes to drink milk,water");
    }


    @Override
    public void hunt() {
        System.out.println("Tiger can hunt people");
    }
}
