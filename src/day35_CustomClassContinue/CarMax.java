package day35_CustomClassContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {
    public static void main(String[] args) {



    CarAtributesMethods car1= new CarAtributesMethods();
    CarAtributesMethods car2= new CarAtributesMethods();
    CarAtributesMethods car3= new CarAtributesMethods();
    CarAtributesMethods car4= new CarAtributesMethods();
    CarAtributesMethods car5=new CarAtributesMethods();

        car1.setInfo("Toyota", "Camry", "White", 2017, 10000);
        //  car1.getInfo();

        car2.setInfo("Honda","CR-V","Black", 2015, 15000.55 );
        // car2.getInfo();

        car3.setInfo("Nissan", "R32 GTR", "Dark Red", 1991, 55000.99);

        car4.setInfo("Range Rover"," HSE Hybrid","White",2019,98000);

        car5.setInfo("Audi","R8","White",2020,105000);

        CarAtributesMethods[]  cars = { car1, car2, car3, car4, car5};

        for( CarAtributesMethods eachCar : cars){
            eachCar.getInfo();
        }

        System.out.println("============================================");

        ArrayList<CarAtributesMethods> carList = new ArrayList<>();
        carList.addAll(  Arrays.asList(cars)  );

        carList.removeIf( p -> p.price < 25000 ); // we removed all the cars that are under 25k

        for(int i = 0; i <= carList.size()-1; i++){
            carList.get(i).getInfo();
        }


}
 }