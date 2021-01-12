package day45_Exceptions.PhoneTask;

public class Huaweei extends Phone {
    public Huaweei(String brand, String model, String country, double price) {
        super(brand, model, country, price);
    }

    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }
}
