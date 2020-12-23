package day35_CustomClassContinue;

import java.time.LocalDate;

public class Cat {

    public String breed;
    public String color;
    public int age;
    public String name;
    public char gender;
    public LocalDate DOB;


    public void catSetInfo(String catColor,String catBreed, int catAge, String catName, char catGender,LocalDate catDOB){
        breed=catBreed;
        color=catColor;
        age=(LocalDate.now().getYear()-DOB.getYear());
        name=catName;
        gender=catGender;
        DOB=catDOB;
    }
    public void catGetInfo(){
        System.out.println(name+" "+breed+" "+age+" "+color+" "+gender+" "+age);
    }

    public void eat(String food){
        System.out.println(name+" is eating");
    }
    public void drink(String juice){
        System.out.println(name+" is drinking");
    }
}
