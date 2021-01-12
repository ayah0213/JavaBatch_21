package day45_Exceptions.PhoneTask;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String country, double price) {
        super(brand, model, country, price);
    }

    public void selfDefence(){
        System.out.println(brand+" "+model+" is for self defence");
    }

    public void breakDefence(){
        System.out.println(brand+" "+brand+" is for for break defence");
    }
}
