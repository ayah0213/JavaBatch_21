package day47_AbstractionIntro.Shapes;

public class Circle extends Shape {
    public final static  double PI = 3.14;
    public double radius;


    // create Constructor to initialize it
    public Circle(double radius) {
        //calling another Shapes class constructor by super keyw
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }
}
