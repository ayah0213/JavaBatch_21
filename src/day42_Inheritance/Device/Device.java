package day42_Inheritance.Device;

public class Device {

    public String deviceNAme, brand, model;
    public double price;

    public  static  String madeIn;
    public static boolean hasBAttery;
    public static boolean hasPowerButton;

    static {
        madeIn = "China";
        hasBAttery = true;
        hasPowerButton=true;

    }

    public void setInfo(String brand,String deviceNAme, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.deviceNAme=deviceNAme;
    }

    public String toString() {
        return "Device{" +
                "deviceANme "+deviceNAme+
                ", brand='" + brand +
                ", model='" + model +
                ", price= $" + price +
                '}';
    }

    public void turnOn(){
        System.out.println("Turning on "+brand+" "+deviceNAme);
    }

    public void turnOff(){
        System.out.println("Turning of "+brand+" "+deviceNAme);
    }
}
