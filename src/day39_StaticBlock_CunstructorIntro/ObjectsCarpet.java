package day39_StaticBlock_CunstructorIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectsCarpet {
    public static void main(String[] args) {

       CarpetClass [] carpets={new CarpetClass(), new CarpetClass(), new CarpetClass(), new CarpetClass(), new CarpetClass() };
       carpets[0].customOrder(5,7,15,false);
       carpets[1].customOrder(5,7,15,true);
       carpets[2].customOrder(8,10,12,false);
       carpets[3].customOrder(10,15,15,true);
       carpets[4].customOrder(15,20,20, true);
        System.out.println(carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);
        System.out.println(carpets[3]);
        System.out.println(carpets[4]);

        ArrayList<CarpetClass> persianCarpets= new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p-> ! p.isPersian);

        ArrayList<CarpetClass> regularCarpets= new ArrayList<>(Arrays.asList(carpets));
       // regularCarpets.removeAll(persianCarpets);  u can use this too or remove if
        regularCarpets.removeIf(p-> p.isPersian);

        System.out.println("===================================================");
        System.out.println("Print out  each of total price with Persian CArpets");
        double totalPriceOfPersianCarpets = 0;
        for (CarpetClass each : persianCarpets){
            System.out.println(each);
            totalPriceOfPersianCarpets+= each.calCost();
        }
        System.out.println("Total price : "+totalPriceOfPersianCarpets);
        System.out.println("=========================================");
        System.out.println("Print each of non Persian carpet with total price");

        double totalPriceOfRegularCarpets =0;
        for (CarpetClass each : regularCarpets){
            System.out.println(each);
            totalPriceOfRegularCarpets+= each.calCost();
        }
        System.out.println("Total price of Regular Carpets are : "+totalPriceOfRegularCarpets);

        System.out.println("===============================================");
        System.out.println("Calculate total price of all carpets");
        double sumofTotalpriceAllCarpets = totalPriceOfPersianCarpets+totalPriceOfRegularCarpets;
        System.out.println("Total price of sum all carpets: "+sumofTotalpriceAllCarpets);

    }
}
