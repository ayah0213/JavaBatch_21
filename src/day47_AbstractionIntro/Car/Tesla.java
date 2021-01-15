package day47_AbstractionIntro.Car;

public class Tesla extends Car{
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Voice contri: say start.");
    }
}
