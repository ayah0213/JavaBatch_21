package day44_Inheritance.Shape;

public class Cube extends Shape {

    public  double side;

    public Cube(double side){
        super("Cube");// Constractor call should before everyhthing
        this.side=side;

    }

    @Override
    public double calcArea(){
        Square square = new Square(side); // one square if the cube
        double area= square.calcArea();// area of 1 square
        return area * 6;
        // also u can use calc of Cube Short way under--> 1)return new Square(side).calcArea()*6; 2) return side * side *6;
    }
    @Override
    public double calcPerimeter(){
    return side *12;
    }
}
