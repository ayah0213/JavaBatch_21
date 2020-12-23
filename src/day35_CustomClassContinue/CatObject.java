package day35_CustomClassContinue;

import java.time.LocalDate;
import java.util.ArrayList;

public class CatObject {
    public static void main(String[] args) {


        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();
        Cat cat5=new Cat();



        cat1.catSetInfo("black","Maltees",7,"Awstralopitechka",'F', LocalDate.of(2020,10,12));
        cat2.catSetInfo("pink","English",5,"Pupsik",'M',LocalDate.of(2011,12,06));
        cat3.catSetInfo("white","Turkmen",8,"Balam",'F',LocalDate.of(2005,05,12));
        cat4.catSetInfo("grey","husky",3,"Josephina",'F',LocalDate.of(2011,12,13));
        cat5.catSetInfo("blue","huskie",3,"Joseph",'M',LocalDate.of(2015,12,13));




        cat3.catGetInfo();
        cat1.eat("Chicken");
        cat2.drink("Bear");

        Cat[]  catss = { cat1, cat2, cat3};

        ArrayList<Cat> huskies = new ArrayList<>();
        ArrayList<Cat> Maltees = new ArrayList<>();

        for (Cat eachCat: catss)
            if (eachCat.breed.equalsIgnoreCase("huskie")){
                huskies.add(eachCat);
            }else if (eachCat.breed.equalsIgnoreCase("maltees")){
                Maltees.add(eachCat);
            }

        System.out.println("Total num of huskies: "+huskies.size());
        System.out.println("Total um of Maltees: "+Maltees.size());






    }
}
