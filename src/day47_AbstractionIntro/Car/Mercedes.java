package day47_AbstractionIntro.Car;

public class Mercedes extends Car {
    public Mercedes( String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Mercedes starts with pushing he keys");
    }
}
