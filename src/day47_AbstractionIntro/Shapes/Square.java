package day47_AbstractionIntro.Shapes;

public class Square extends Shape {
    public double side;

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side *4;
    }
}
