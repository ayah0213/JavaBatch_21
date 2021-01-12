package day44_Inheritance.Car;

public class MErcedes  extends Car {

    public MErcedes(String model, String color, String brand, double price, int year) {
        super("Mercedes", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Push start button");
    }
}