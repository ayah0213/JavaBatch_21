package day43_InheritanceReview.CarTask;

public class CarMAx {

    public static void main(String[] args) {
        Toyota toyota= new Toyota("Camry", "Blue",2019,235000, 10.000);

        BMW bmw = new BMW("X5","Red",2013, 15000, 50.000);

        System.out.println(Toyota.isAffrodable);
        System.out.println(Toyota.isImmoral);
        System.out.println(toyota);
        System.out.println(bmw);


    }
}
