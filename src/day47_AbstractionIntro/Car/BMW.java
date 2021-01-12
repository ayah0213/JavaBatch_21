package day47_AbstractionIntro.Car;

public class BMW  extends Car{
    public BMW(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("call mechanic: oil change to start your car to drive");
    }
}
