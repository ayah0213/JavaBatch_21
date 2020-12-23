package day38_CustomClassContinue;

public class IPhone {

    public String model, color, storage,brand, OS;
    public double price;
    public boolean madeInChina;

   // public static String brand = "Apple", OS="iOS", madeIn = "China";

    public void setInfo(String model, String color, String storage, double price,String brandd,boolean madeINChina, String ioS) {


    }

    public void call(long phoneNumber){
        System.out.println("Iphone "+model+ "  is calling "+phoneNumber);
    }

//    public static void getIphoneInfo(){
//        return "Brand : "+brandd, "Operaqting system: "+OS,"Country of made in "+madeIn;
//    }

    public String toString(){
        return "Brand is : "+brand+", Moodel is: "+model+", Color is :"+color+", Price is :"+price+", Storage: "+storage;
    }




}
