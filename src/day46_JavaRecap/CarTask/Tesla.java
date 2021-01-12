package day46_JavaRecap.CarTask;

public final class Tesla extends Car {

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" is able to start by Voice Controll");

    }
}
