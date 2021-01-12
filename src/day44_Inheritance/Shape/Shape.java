package day44_Inheritance.Shape;


public class Shape {

    public String name;
    public final static boolean isShape, hasArea, hasPerimeter;// constand variables

    public Shape(String name) {//thi was setInfo -> we change it into Contsractor
        // by giving only classNAme with argumen tpe
        this.name = name;
    }

    static {
        hasPerimeter = true;
        hasArea = true;
        isShape = true;
    }

    public double calcArea() {
        return 0;
    }

    public double calcPerimeter() {
        return 0;
    }

    public String toString() {
        return "Shape { " + "name:" + name + ", Area: " + calcArea() + ", Permeter: " + calcPerimeter() + "}";

}



    // crate a class called Shape
    // variables: name, isShape(boolean), hasArea. hasPerimeter, hasVolume
    // methods: setInfo, calcArea, calcPerimeter
    // toString (): return the name, area and perimeter that are returned by calcArea, calcPerimeter
 }
