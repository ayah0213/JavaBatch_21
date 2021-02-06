package day49_AbstractionPractice_Interface.Shapes;

public class Rectangle extends Shape{

    private double w, l;


    // constructor
    public Rectangle(double w, double l) {
        super("Rectangle");
        if(w <= 0 || l <= 0){
            throw new RuntimeException("No such a rectangle with width & length of "+w+" "+l);
        }
       setL(l);
        setW(w);
    }

    @Override
    public double area() {
        return w*l;
    }

    @Override
    public double perimeter() {
        return 2*(w+l);
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
