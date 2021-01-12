package day44_Inheritance.Car;

public class Car {

    public String brand, model,color;
    public double price;
    public int year;

    public Car (String brand, String model, String color, double price, int year){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.year=year;
    }
     public void start(){
         System.out.println("Insert key and twist it to start it");
     }

     // toStrinng method to print it out
    public String toString(){
        return "Car{"+"brand="+brand+", model="+model+", color="+color+", price $"+price+", year="+year+"}";
    }

}
