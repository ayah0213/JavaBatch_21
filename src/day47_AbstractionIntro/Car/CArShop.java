package day47_AbstractionIntro.Car;

public class CArShop {

    public static void main(String[] args) {
        Mercedes mercedes= new Mercedes("l-class","Black",2013,12.998);
        BMW bmw = new BMW("x3","Silver",2019,3.999);
        Toyota toyota = new Toyota("prius","white",2006,3.789);
        Tesla tesla = new Tesla("A-class","Red",2012,12.999);

        System.out.println("Start Mercedes: ");
        mercedes.start();
        System.out.println("--------------------------");
        System.out.println("Start BMW");
        bmw.start();
        System.out.println("---------------------------");
        System.out.println("Start Toyota: ");
        toyota.start();
        System.out.println("----------------------------");
        System.out.println("Start Tesla: ");
        tesla.start();

        }
    }
