package day49_AbstractionPractice_Interface.Shapes;

import java.text.DecimalFormat;

public abstract class Shape {


    private   final String name;
    public static DecimalFormat df = new DecimalFormat("0.00");

    public Shape(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be empty");
        }
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();


    @Override
    public String toString() {
        return "Shape{" +
                "name= '" +getName()+ '\'' +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
