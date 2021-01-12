package day46_JavaRecap.CarTask;

import day32_WrapperClass_LocalDate.LocalDateTime;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class Car {

    public static int numberOfTires =4;
    public static boolean hasEngine=true, hasSeats;
    static {
        numberOfTires=4;
        hasEngine=true;
        hasSeats=true;
    }
    public String brand, model, color;
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {
        if (year > LocalDate.now().getYear() || year <= 0 ){
            throw new InputMismatchException(("Car year cant be invalid"+year));
        }
        if (price <= 0){
            throw new RuntimeException("Car price cant be negative or Zero"+price);
        }
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }


    public String toString() {
        return "Cra{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }

    public final void drive(){
        System.out.println("driving "+brand+""+model);
    }
}

/*
Car Task:
        1. create a class called Car:
                    Attributes: Brand, Model, Color, Year, Price
                    Add a constructor that can initialize the instances:
                                if the price is set to negative throw an exception with a message of: "Car price can't be negative"
                                if the the year is greater than current year or negative, throw an exception with a message of: "Invalid Year"
                    Methods: start, drive, toString
        2. create the following sub classes of Car:
                        1. Mercedes
                        2. BMW
                        3. Lexus
                    Make sure those class cannot be inherited
                    each sub class should have constructor with 4 arguments: Model, Color, Year, Price
        3. create a class called CarMax
                create objects of each Cars, and set:
                        year: 2022
                        price: -25000
 */