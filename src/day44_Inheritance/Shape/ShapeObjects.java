package day44_Inheritance.Shape;

import org.w3c.dom.css.Rect;

public class ShapeObjects {

    public static void main(String[] args) {


        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());
        System.out.println(square.calcArea());


    }
}