package day46_JavaRecap.CarTask;

public final class BMW extends Car{
    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand+" "+model+" is starting by calling mechanic");

    }
    public void autoPark(){
        System.out.println(brand+" "+model+" is parking by itself");

    }
}
