package day25_Array_Intro;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true) {


            System.out.println("Which room would u like ?");
            System.out.println("\t\t A King bed == $120");
            System.out.println("\t\t B Queen bed= $100");
            System.out.println("\t\t C Twin bed == $80");

            String word = scan.nextLine().toLowerCase();
            while (!(word.equalsIgnoreCase("king bed") || ! word.equalsIgnoreCase(" queen bed") || ! word.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid entry please try again!");
                word = scan.nextLine().toLowerCase();
            } // to make sure user selected right selection of bed

            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would u lik eto select other room?");
            String answer = scan.nextLine().toLowerCase();


            while ( !(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid selection please try again");
                System.out.println("Would u lik eto select other room?");
                answer=scan.nextLine().toLowerCase();
            }


                if (answer.equals("no")){
                    System.out.println("Your total price: "+total);
                break; // exiting loop
            }

        }
    }
}
