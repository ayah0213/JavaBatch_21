package Replt_It;

import java.util.Scanner;

public class repl_35 {
    /*
    Let's say I've got a 100$ gift card and you want to buy something in your online store .
    Write a program that will help me to buy something and display leftover balance after purchase.
    If item is not in the list, display message: "Invalid item!".
    If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
     */
    public static void main(String[] args) {
        int giftCard = 100;
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        if (input.equalsIgnoreCase("Smartphone") || (input.equalsIgnoreCase("Laptop"))) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (input.equalsIgnoreCase("Charger")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 15;
        } else if (input.equalsIgnoreCase("USB CABLE")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 10;
        } else if (input.equalsIgnoreCase("Headphones")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 30;
            System.out.println("Your current balance is: " + giftCard);
        } else if (input.equalsIgnoreCase("Pants")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 50;
            System.out.println("Your current balance is: " + giftCard);
        } else if (input.equalsIgnoreCase("Hat")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 25;
            System.out.println("Your current balance is: " + giftCard);
        } else if (input.equalsIgnoreCase("Socks")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 5;
            System.out.println("Your current balance is: " + giftCard);

        } else if (input.equalsIgnoreCase("Blanket")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 60;
            System.out.println("Your current balance is: " + giftCard);
        } else if (input.equalsIgnoreCase("Pillow")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 40;
            System.out.println("Your current balance is: " + giftCard);
        }else {
            System.out.println("Invalid item!");
        }
    }
}

