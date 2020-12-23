package day37_InstanceClass;

import java.time.LocalDate;

public class Car {

    public  String brand, model, color;
    public LocalDate DOB;// 2019-7-7
    double milleage, price;
    public  int year; //2019

    public void setInfo(String brand, String model, String color, LocalDate DOB, double milleage, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.DOB = DOB;
        this.milleage = milleage;
        this.price = price;
        year= DOB.getDayOfYear();
    }

    // to call automatically call to execute create To String method



    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", DOB=" + DOB +
                ", milleage=" + milleage +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
    public void driver(){
        System.out.println("driving "+brand+" model"+model);
    }
}
