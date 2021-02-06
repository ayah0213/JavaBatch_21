package day50_Polymorphism.PhoneTask;

public final class Iphone extends Phone implements Apple {

    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if (price>1500){
            throw new RuntimeException("Invalid price , shouldl be less than $1500");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Dowloading Apps "+ApplStoreName);
        System.out.println("Operating system in Iphone is : "+AppleiOS);

    }

    @Override
    public void textint() {
        System.out.println("Iphone can text by voice control");
    }

    @Override
    public void call() {
        System.out.println("Calling with the help of SIRI");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "'OS="+AppleiOS+
                '}';
    }
}
