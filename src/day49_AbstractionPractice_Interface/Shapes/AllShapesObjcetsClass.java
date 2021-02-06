package day49_AbstractionPractice_Interface.Shapes;

import java.util.ArrayList;
import java.util.Arrays;

public class AllShapesObjcetsClass {
    public static void main(String[] args) {


        Circle circle = new Circle(23);
        System.out.println(circle);
        System.out.println("-------------------------");

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        System.out.println("---------------------------");

        Cube cube = new Cube(15);
        System.out.println(cube);
        System.out.println("----------------------------");

        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println(cylinder);
        System.out.println("-----------------------------");

        Square square = new Square(50);
        System.out.println(square);

        System.out.println(rectangle.getL());// getting lentgh of rectangle with getter cause its private


        Shape[] shapes = {circle, rectangle, cube, cylinder, square, new Circle(5),new Circle(6.7)};

        for (Shape eachShape : shapes){
            if (eachShape.equals("Circle")){
                System.out.println(eachShape);
            }
        }
        System.out.println("=====================================================");

        ArrayList<Shape> circles = new ArrayList<>();
        circles.addAll(Arrays.asList(shapes));
        circles.removeIf(p-> !p.equals("Circle"));
        System.out.println(circles.size());
        System.out.println("=========================================================");


      circles.forEach(each -> { if (each.area() > 400 ) System.out.println(each);});
        System.out.println("================================================================");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.forEach(p ->{if (p%2==0) System.out.println("is even numbers :"+p);});
        System.out.println(list);

        System.out.println("================================================================");
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15));
        numbers.forEach( p -> { if (p%2 == 0) evenNumbers.add(p); else oddNumbers.add(p); });
        System.out.println("oddNumbers :"+oddNumbers);
        System.out.println("evenNumbers: "+evenNumbers);
    }
}