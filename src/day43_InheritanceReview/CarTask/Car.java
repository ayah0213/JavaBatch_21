package day43_InheritanceReview.CarTask;

public class Car {

    public String brand, model,color,madeIn;
    public int yeas;
    public double miles, price;

    public static boolean hasEngine, hasWheel, hasTires;
    static {
        hasEngine = true;
        hasWheel=true;
        hasTires=true;
    }

    public void setInfo(String brand, String model, String color, String madeIn, int yeas, double miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.yeas = yeas;
        this.miles = miles;
        this.price = price;
    }


    public void drive(){
        System.out.println("driving "+brand+" "+model);
    }

    public void park(){
        System.out.println("parking "+brand+" "+model);
    }

    public String toString(){
        return "Year is "+yeas+" brand is "+brand+" model is "+model+" color is "+color+" number of miles "+miles+" price is $"+price;
    }
}
