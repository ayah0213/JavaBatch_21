package day16_ScannerString;

import java.util.Scanner;

public class Task3ScannerQuestions {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("what is your name?");
        String name=scan.next();
        System.out.println("Are curently employed?");
        String emplORNo=scan.next();
        if (emplORNo.equalsIgnoreCase("yes")){
            System.out.println("where re u working?");
            scan.next();
        }else {
            System.out.println("you should find a job");
        }
        System.out.println("what is your salary?");
        double salary= scan.nextDouble();

        System.out.println("Thas very low u should chnage your job");

        System.out.println(name+","+emplORNo+","+salary);


    }
}
