package day47_AbstractionIntro.Shapes;

public abstract class Shape {

    public String name;


    // generate Cinstructor
    public Shape(String name) {
        this.name = name;
    }

    // abstract methods which we created iwthout the body
    public abstract double area();
    public abstract double perimeter();
}
