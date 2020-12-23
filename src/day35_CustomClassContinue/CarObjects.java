package day35_CustomClassContinue;

public class CarObjects {

    public static void main(String[] args) {

        CarAtributesMethods car1=new CarAtributesMethods();// instance obj
        CarAtributesMethods car2=new CarAtributesMethods();// instance obj
        CarAtributesMethods car3=new CarAtributesMethods();// instance obj

       car1.brand="Toyota";
       car2.brand="BMW";
       car3.brand="Kia";
        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);

        car1.model="Corolla";
        car2.model="360x";
        car3.model="Soul";
        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);

        CarAtributesMethods car4= new CarAtributesMethods();
        car4.setInfo("Mercedes","C300","Red",2018,20.00);
        System.out.println(car4.model);
        System.out.println(car4.brand);
        System.out.println(car4.color);
        System.out.println(car4.year);


        System.out.println(car4.year+" "+car4.model+" "+car4.year+car4.color);



    }
}
