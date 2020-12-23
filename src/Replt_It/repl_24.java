package Replt_It;

import java.util.Scanner;

public class repl_24 {
    /*

Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables:workPhoneNumber and personalPhoneNumber.

-Create a Scanner object named scan.

Execution flow with example:
-Display prompt "Welcome to the patient portal!"
-Display prompt "Please enter your personal information"

     */
    public static void main(String[] args) {

        String firstName, lastName, fullName, email, street, state, city, adress, contacts;
        int age, zipcode;
        double height, weight;
       // boolean isMarried;
        long workPhoneNum, personalPhonNum;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter you last name");
        lastName = scan.next();
        System.out.println("Enter your email");
        email = scan.next();
        System.out.println("Enter your street");
        street = scan.next();
        System.out.println("Enter your city");
        city = scan.next();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter you work phone number");
        workPhoneNum = scan.nextLong();
        System.out.println("Enter you personal phone number");
        personalPhonNum = scan.nextLong();
        System.out.println("Enter you age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height=scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried;
        if (isMarried = scan.nextBoolean()) {
            isMarried = true;
        }

        contacts="work phone number - "+workPhoneNum+
                ", personal phone number - "+personalPhonNum+
                ", email: "+email;
        fullName= lastName+ ","+firstName;
        adress=street+", "+city+", "+state+" "+zipcode;


        System.out.println("Patient personal information");
        System.out.println("Full Name: "+fullName);
        System.out.println("Adress: "+adress);
        System.out.println("Contacts: "+contacts);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weights: "+weight+" pounds");
        System.out.println("Married?: "+isMarried);

    }
}
