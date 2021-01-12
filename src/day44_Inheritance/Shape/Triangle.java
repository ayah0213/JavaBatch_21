package day44_Inheritance.Shape;

public class Triangle extends Shape{

    public double height, base, side;

    // we re created Constructor CAll with "super" keyword
    public Triangle( double height, double base, double side) {
        super("Triangle");
        this.height = height;
        this.base = base;
        this.side=side;
    }

    @Override
    public double calcArea() {
        return base * height * 0.5;
    }

    @Override
    public double calcPerimeter() {
        return height + base + side;
    }

}
