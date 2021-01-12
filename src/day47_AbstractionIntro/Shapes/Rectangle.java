package day47_AbstractionIntro.Shapes;

public class Rectangle extends Shape{
    public double width, length;


    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width=width;
        this.length=length;
    }

    @Override
    public double area() {
        return width* length;
    }

    @Override
    public double perimeter() {
       return width * 2 * length *2;
    }
}
