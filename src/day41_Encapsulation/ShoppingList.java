package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

  ArrayList<Item> items = new ArrayList<>();
  items.addAll(Arrays.asList( // adding 5 new items
          new Item("sanitizer",15, 30),
          new Item("masks",10, 225),
          new Item("Watermelon", 2,2.24),
          new Item("Toilet paper", 20,50),
          new Item("Apple",14,22.25)));

        System.out.println(items);

        double total=0;
        for (Item eachItem : items){
            total+= eachItem.calcCost();
        }
        System.out.println("Total cost of 6 items: "+total);


    }

    /*
    create a class called ShoppingList
    create 5 objcets of Item and store them into ArrayList of Items
    calculate the total cost of all Items in the List
     */
}
