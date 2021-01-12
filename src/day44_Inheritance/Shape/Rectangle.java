package day44_Inheritance.Shape;

public class Rectangle extends Shape {


    public double width, length;

    public Rectangle (double width, double length){
        super("Rectangle"); // Constractor call should before everyhthing
        this.length=length;
        this.width=width;
    }

   public double calcArea(){
        return width * length;
    }

    @Override
    public double calcPerimeter() {
        return (width+length)*2;
    }
}
