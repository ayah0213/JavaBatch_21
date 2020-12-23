package day38_CustomClassContinue;

import java.text.DecimalFormat;

public class Circle {
    /*
Warmup Tasks:
        1. create a custom class called Circle
                Attributes:
                    radius, diameter, area, perimeter
                methods:
                    caculateArea: returs the area of the circle
                    calculatePerimeter: returns the perimeter of the circle
                    setInfo: initializes all the instance of the Circle
                    toString methods
     */
   public double radius, diameter, area, perimeter;


   public  void setInfo( double radius){
       this.radius=radius;
       diameter= 2* radius; // we doont have to call this. keyword cause dont have Local Diameter
       area=calculateArea();
       perimeter=calculatePerimeter();


   }



   public double calculateArea(){ // formula calculates Area
       return radius * radius *Math.PI;

    }

    public double calculatePerimeter(){
       return  diameter * Math.PI;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area)  +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }

    public boolean equals(Circle circle){
       return this.radius==circle.radius;
    }
}
