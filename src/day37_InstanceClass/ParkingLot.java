package day37_InstanceClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot { // has relationship

    public static  void main(String[] args) {

        Car[] cars = {new Car(), new Car(), new Car(), new Car(), new Car()};

        cars[0].setInfo("BMW", "s300", "Black", LocalDate.of(2016, 6, 22), 10.000, 10000);
        cars[1].setInfo("BMW", "s400", "Black", LocalDate.of(2020, 5, 02), 50.000, 10.000);
        cars[2].setInfo("BMW", "m4", "Black", LocalDate.of(2010, 7, 03), 230.000, 10.000);
        cars[3].setInfo("BMW", "i8", "Black", LocalDate.of(2005, 3, 11), 120.000, 10.000);
        cars[4].setInfo("BMW", "x5", "Black", LocalDate.of(2021, 8, 12), 60.000, 10.000);
        cars[5].setInfo("BMW", "i8", "Black", LocalDate.of(2003, 4, 23), 40.000, 10.000);

        System.out.println("--------------------------------------------------------");
        //recall ALL BMW that build before 2017
        ArrayList<Car> recall1 = new ArrayList<>();
        for (Car each : cars) {
            if (each.year < 2017) {
                recall1.add(each);
            }
        }
        System.out.println(recall1);

        System.out.println("----------------------------------------------------------------");
        // recall All BMW i8 that were build before 2016
        ArrayList<Car> recall2 = new ArrayList<>();

        for (Car each : cars) {
            if (each.brand.equalsIgnoreCase("BMW")) {
                if (each.model.equalsIgnoreCase("i8") && each.year < 2016) {
                    recall2.add(each);
                }
            }
        }

        System.out.println(recall2);
        System.out.println("------------------------------------------------------------");
        // remove all the car that re NOT BMW m4
        ArrayList<Car> myCollection = new ArrayList<>();
        myCollection.addAll(Arrays.asList(cars));

        myCollection.removeIf(p-> !(p.brand.equalsIgnoreCase("BMW") && p.model.equalsIgnoreCase("m4")));

    }
}
