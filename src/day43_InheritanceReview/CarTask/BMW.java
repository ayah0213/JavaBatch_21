package day43_InheritanceReview.CarTask;

public class BMW extends Car{

    public BMW(String model, String color, int year, int mies, double price) {
        setInfo("Toyota",model,color,"Japan",yeas, miles, price);
    }
    public static boolean isExpensive, isLuxury, breaksALot;

    static {
        isExpensive=true;
        isLuxury=isExpensive;
        breaksALot=breaksALot;
    }

    public void race(){
        System.out.println(brand+" "+model+" is racing");
    }
}
