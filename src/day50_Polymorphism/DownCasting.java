package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;

import day43_InheritanceReview.CarTask.Car;
import day43_InheritanceReview.CarTask.Toyota;
import day45_Exceptions.PhoneTask.Iphone;
import day45_Exceptions.PhoneTask.Phone;
import day45_Exceptions.PhoneTask.Samsung;
import day49_AbstractionPractice_Interface.RemoteDriver.WebDriver;


public class DownCasting {
    public static void main(String[] args) {


        // EXCEPTION of DownCAtsing when we re using different obj methods

        Animal animal = new Cat("inci","black","sma","beed",'f',2);
        //((Dog)animal). bark();

        Car car = new Toyota("Camry","White",2020,4300,3500);
        // ((BMW)car.race();


        System.out.println("==========================================");
        Phone phone= new Samsung("I87",23.909);
        //((Iphone)phone).faceTime(23232);


        System.out.println("======================");

    }

}
