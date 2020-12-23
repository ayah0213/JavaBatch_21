package day40_Constructor;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;

    public Car(String brand){
        this.brand=brand;
    }

    public Car(String brand, String model){
        this(brand);
        this.model=model;
    }

    public Car(String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, String color, int year, double price) {
       this(brand, model, year, price);
        this.color = color;
    }


}
