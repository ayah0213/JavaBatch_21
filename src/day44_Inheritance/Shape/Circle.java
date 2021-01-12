package day44_Inheritance.Shape;

public class Circle extends Shape {

    public double radius, diameter;
    public static double PI; // sttaic cause its only 1 copy, after we do finally we have to setup PI with static block

    static {
        PI=3.14;
    }
    public Circle(double radius){
        super("Circle");// Constractor call should before everyhthing
        this.radius=radius;

        this.diameter= radius *2;
    }


    public double calcArea(){
        return radius*radius*PI;
    }
}
