package day50_Polymorphism;

import day50_Polymorphism.PhoneTask.Iphone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;
import day49_AbstractionPractice_Interface.RemoteDriver.ChromeDriver;
import day49_AbstractionPractice_Interface.RemoteDriver.FireFoxBrowser;
import day49_AbstractionPractice_Interface.RemoteDriver.WebDriver;
import day49_AbstractionPractice_Interface.Shapes.Circle;
import day49_AbstractionPractice_Interface.Shapes.Rectangle;
import day49_AbstractionPractice_Interface.Shapes.Shape;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone 12", "Small", "Black", 1200);
        Samsung samsung1 = new Samsung("Galaxy note20", "Medium", "Grey", 999);
        Phone phone1 = new Samsung("Galaxy note20", "Medium", "Yellow", 899);
        Phone phone2 = new Iphone("Iphone 10", "Large", "Black", 1300);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Iphone("Iphone8", "xsmall", "grey", 800));
        phones.add(new Samsung("Note10", "REd", "White", 233));

        Shape shape;
        shape = new Circle(3);
        shape = new Rectangle(3, 2);
        System.out.println(shape.perimeter());
        System.out.println(shape.area());


        System.out.println("===========================");
        String browserNAme = "chrome";
        WebDriver driver;
        switch (browserNAme) {
            case "Firefox":
                driver = new FireFoxBrowser();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
    }
}