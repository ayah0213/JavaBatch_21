package tasks.Inheritence.Restaurant;

public class Chef extends Employee {


    public Chef(String name, String title, String employeeID, double hourlyRate, boolean fullTime){
        setInfo(name, title, employeeID, hourlyRate, fullTime);
    }

    public void prepareOrders(){
        System.out.println(name+" is preparing orders");
    }

    public void washDishes(){
        System.out.println(name+" is washes dishes");
    }

}
