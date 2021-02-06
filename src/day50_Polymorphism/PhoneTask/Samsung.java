package day50_Polymorphism.PhoneTask;

public final class Samsung extends Phone implements Android {
    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
        if (price >1200){
            throw new RuntimeException("Invalid price, samsung price cant be more than $1200");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("It needs to dowload apps from : "+AndroidStoreName);
        System.out.println("It has Operting Sytsem :"+AndroidOS);
    }

    @Override
    public void textint() {
        System.out.println("Can text by Google text");
    }

    @Override
    public void call() {
        System.out.println("Can call by Bixby");
    }


    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "'OS="+AndroidOS+
                '}';
    }
}
