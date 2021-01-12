package day44_Inheritance.Car;

public class CarObjects {

    public static void main(String[] args) {

        Honda honda = new Honda("Civic","Red","36i",34.9,2013 );
        honda.start();
        System.out.println(honda);

        MErcedes mercedes = new MErcedes("Lclass","Black","23Oi",23.87, 2019);
        mercedes.start();
        System.out.println(mercedes);

        Jeep jeep = new Jeep("Cherooke","WHite","Pioi2",13.8, 2010);
        jeep.start();
        System.out.println(jeep);

        Tesla tesla= new Tesla("Model Y","Pink","Guara", 35.9, 2020);
        tesla.start();
        System.out.println(tesla);
    }
}
