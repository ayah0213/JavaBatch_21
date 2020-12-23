package day42_Inheritance.Device;

public class Computer extends  Device {

    public Computer(String brand, String model, double price) {
        setInfo(brand, "HP e800", model, price);
    }

    public static boolean touchscreen, iCore7;

    static {
        touchscreen = true;
        iCore7 = false;
    }

    public void releaseYaar() {
       System.out.println(deviceNAme+" "+"realeased date is 2017");
    }


    public void updatedWindowsCore(){
        System.out.println(deviceNAme+" had updated its windows");
    }


    public String toString() {
        return "Computer{" +
                "deviceNAme='" + deviceNAme +
                ", brand='" + brand +
                ", model='" + model +
                ", price=" + price +
                '}';
    }
}