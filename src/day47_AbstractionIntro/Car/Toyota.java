package day47_AbstractionIntro.Car;

public class Toyota extends Car{

    // generate Constructor of Toyota
    public Toyota( String model, String color, int year, double price) {
        super("Toyoota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("insert key: twist the key into ignition");
    }
}
