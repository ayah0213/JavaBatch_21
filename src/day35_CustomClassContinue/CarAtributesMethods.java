package day35_CustomClassContinue;

public class CarAtributesMethods {

    public String brand; // instance variable
    public String model; // instance
    public String color;// instance
    public int year;
    public double price;

    public void setInfo(String carModel, String carBrand, String carColor,int  carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color = carColor;
        year=carYear;
        price=carPrice;

    }

    public  void getInfo(){
        System.out.println(year+" "+brand+" "+color+year+price);
    }

}
