package day43_InheritanceReview.CarTask;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, int mies, double price) {
        setInfo("Toyota",model,color,"Japan",yeas, miles, price);
    }
    public static boolean isAffrodable, isImmoral;

    static {
        isAffrodable=true;
        isImmoral= true;
    }
}
