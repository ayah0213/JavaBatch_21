package day42_Inheritance.Device;

public class TV extends Device {

    public TV(String brand, String model, double price){
        setInfo(brand,"TV",model, price);
    }
    public static boolean hasChannel, hasCabel;

    static {
        hasCabel=true;
        hasChannel=true;
    }

    public void channelUp(){
        System.out.println("Channel up "+brand+" "+deviceNAme);
    }

    public void channelDown(){
        System.out.println("Channel down "+ brand+" "+deviceNAme);
    }
}
