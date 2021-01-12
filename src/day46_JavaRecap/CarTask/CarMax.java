package day46_JavaRecap.CarTask;

public class CarMax {
    public static void main(String[] args) {

        Mercedes mercedes= new Mercedes("G class","Red",2018,39.999);
        BMW bmw= new BMW("X4","Black",2009,9.989);
        Lexus lexus = new Lexus("S class","Pink",2013,8.989);
        Tesla tesla = new Tesla("A class","white",2020,25.999);

        mercedes.driver();
        mercedes.start();
        System.out.println(mercedes);

        bmw.autoPark();
        bmw.start();
        System.out.println(bmw);

        tesla.autoPilot();
        System.out.println(tesla);
    }
}
