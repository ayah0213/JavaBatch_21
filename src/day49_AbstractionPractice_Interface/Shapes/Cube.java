package day49_AbstractionPractice_Interface.Shapes;

public final class Cube extends Shape implements Volume{

    public double side;
    public Cube(double side) {
        super("Cube");
        if(side <= 0){
            throw  new RuntimeException("No such a cube with side of "+side);
        }
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double area() {
        Square square =new Square(side);
        return square.area() * 6;
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name= '" + getName() + '\'' +
                ", area= '" + df.format(area() ) + '\'' +
                ", perimeter= '" + df.format(perimeter()) + '\'' +
                ", volume= '" + df.format( volume() ) + '\'' +
                '}';
    }


}
