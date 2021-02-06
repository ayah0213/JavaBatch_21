package day48_AbtsractionPractice.AnimalTask;

public class Buterfly extends Animals implements Flyable {


    public Buterfly(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Butterlies can sleep about 1 or 2 hrs");
    }

    @Override
    public void eat() {
        System.out.println("Butterflies eats little flowers");
    }

    @Override
    public void drink() {
        System.out.println("Butterflie drink honey");
    }

    @Override
    public void fly() {
        System.out.println("Butterflie can Fly");
    }
}

