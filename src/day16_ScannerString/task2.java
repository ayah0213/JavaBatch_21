package day16_ScannerString;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("With how many people you re living with?");

        int people= scan.nextInt();

        if (people<2){
            System.out.println("Live wirh less than 2 people");
        }else if (people < 6){
            System.out.println("Lives from 3 to 6 people");
        }else if (people>6){
            System.out.println("User live with more than 6 people");


        }

        System.out.println("====================");

        Scanner scan2=new Scanner(System.in);


        System.out.println("From which city re u from?");
        String cityName=scan.next();
        System.out.println(cityName);
        System.out.println("Is it downtown or uptown?");
        String uptDown=scan.next();
        //System.out.println(uptDown);

        System.out.println("Have you thought moving to another state?");
        String moving=scan.next();
        if (moving.equalsIgnoreCase("yes")){
            System.out.println("Thats great do it ASAP");
        }else {
            System.out.println("Just be patient u will be fine moving soon");
        }
        System.out.println("Do u have a car?");
        String car=scan.next();
        if (car.equalsIgnoreCase("yes")){
            System.out.println("which model is that?");
        }else {
            System.out.println("You should get one as soon as u can");
        }
        System.out.println("It was nice to talk to you, how about you?");
        String meetingNice=scan.next();




        }


    }

