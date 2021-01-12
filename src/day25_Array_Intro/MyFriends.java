package day25_Array_Intro;

import day17_String_Memory.ScannerTAsk3;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {

        String[] firstNAme=new String[5];
        firstNAme[0]="Muh";
        firstNAme[1]="Olya";
        firstNAme[2]="Beka";
        firstNAme[3]="Marak";
        firstNAme[4]="JEka";
        String[] lastName=new String[5];
        lastName[0]="MOhammad";
        lastName[1]="Yusufi";
        lastName[2]="Agalarov";
        lastName[3]="Muradova";
        lastName[4]="Joshephina";

        for (int i = 0; i < firstNAme.length ; i++) {
            System.out.println("Student is "+firstNAme[i]+" and last name is "+lastName[i]);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("how many friends?");
        int number=scan.nextInt();

        String[] fname= new String[number];
        String[] lname= new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter first name");
            String f=scan.next();
            fname[i]=f;
            System.out.println("Enter last name");
            String l=scan.next();
            lname[i]=l;
        }

        for (int i = 0; i < number ; i++) {
            System.out.println(fname[i]+" "+lname[i]);
        }


    }
}
