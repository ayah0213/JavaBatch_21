package day41_Encapsulation;

public class Circle {

    private double radius, diameter, area, perimeter;
    private final static  double PI;
    static {
        PI= Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius *2;
        area = calculateArea();
        perimeter = calculatePErimeter();
    }

    private  double calculateArea(){
        return radius * radius *PI;
    }

    private double calculatePErimeter(){
        return diameter * PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = radius*2;
        area = calculateArea();
        perimeter=calculatePErimeter();
    }



}
