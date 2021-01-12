package day44_Inheritance.Car;

public class Tesla extends Car{

    public Tesla(String model, String color, String brand, double price, int year){
        super("Tesla",model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Voicemail say \"SAY START\" ");
    }
}
