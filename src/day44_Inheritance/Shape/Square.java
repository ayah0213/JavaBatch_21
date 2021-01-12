package day44_Inheritance.Shape;

public class Square extends Shape{

    public double side;

    public Square(double side){
        super ("Square");// Constractor call should before everyhthing
        this.side=side;

    }
    public double calcArea(){
       return side * side;
    }
    public double calcPerimeter(){
        return side * 4;
    }

}
