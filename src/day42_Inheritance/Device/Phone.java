package day42_Inheritance.Device;

public class Phone extends  Device{

    public static boolean canCall, canSendMessage, hasCamera;
    static {
        canCall=true;
        canSendMessage=true;
        hasCamera=true;
    }

    public Phone(String brand, String model, double price){
        setInfo(brand,"phone",model, price);
    }

    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void text(long num){
        System.out.println(brand+" "+model+" is texting "+num);
    }
}
