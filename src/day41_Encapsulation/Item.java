package day41_Encapsulation;

public class Item {

    public String name;
    public int quantity;
    public double unitPrice;

    // creating the CONSTRUCTOR
    public  Item(String name, int quantity, double unitPrice){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }

    // returns totalPrce
    public double calcCost(){
        return quantity* unitPrice;
    }

    public String toString(){
        return "Item {"+"name=" +name+", quantity=" +quantity+", unit price="+unitPrice+"+,"+ calcCost()+"}";

    }


    /*
    Create a class called Item:
     instance variables:
     name, unitPrice, quantity
     add constructor that can initialize the fhe fields
       instance methids:
     calCost();
     return the total cost as double
     hint: totalCost = quantity * unitPrice
     toString(): returns name, uitPrice , quanitity, and total cost info as calculated by calCost().

     */
}
