package day17_String_Memory;

import java.util.Scanner;

public class TravelTask {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double costTickets=0;

        System.out.println("Do you have valid Password?");
        String validPasw=scan.next();

        if (validPasw.equals("yes")){
            costTickets=1000;
            System.out.println("Enter a country which u travel to?");
            scan.nextLine();
            String country= scan.nextLine();

            System.out.println("Hpw many bags u will take with you?");
            byte bags=scan.nextByte();

           costTickets+= (bags*50);

            System.out.println("How many ppl re u travelling with?");
            short pplTrav= scan.nextShort();

            if (pplTrav>=3){
                costTickets-=300; // cost will reduce byb 300
            }else {
                costTickets-=(pplTrav*100);
            }
            System.out.println("Enter the num of ppl u will travel with");
            scan.nextLine();
            String namesPpl= scan.nextLine();

            System.out.println("Your ticket is booked to : "+country+". We have charged extra for the "+bags+", " +
                    "  bags but you re travelling with "+namesPpl+ " so we re giving you some doscounts. Ypur total "+costTickets);



        }else{

        }







    }
}
