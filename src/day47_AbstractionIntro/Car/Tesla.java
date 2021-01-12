package day47_AbstractionIntro.Car;

public class Tesla extends Car{
    public Tesla(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Voice contri: say start.");
    }
}
