package day44_Inheritance.Car;

public class Jeep extends  Car{


    public Jeep(String model, String color, String brand, double price, int year){
        super("Jeep",model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Call mechanic , oil change");
    }
}
