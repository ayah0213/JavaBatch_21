package day18_StringMethods;

import java.util.Scanner;

public class StringMethods2 {

    public static void main(String[] args) {

        String str ="Cybertek";

       str = str.concat(" School");
        System.out.println(str);

        String str2 = "Cybertek";

        str2=str2+" School";
        System.out.println(str2);

        System.out.println("===========================");

        String name="bank of amerikca";
        name=name.toUpperCase();// BANK OF AMERIKA
        System.out.println(name);

        name=name.toLowerCase();
        System.out.println(name);

        System.out.println("============================");

        String s1= "              Hello";
        s1=s1.trim();
        System.out.println(s1);

        String s2="Hello                 Everyone";
        s2=s2.trim();
        System.out.println(s2);

        System.out.println("=============================");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you name");
        String fName=scan.nextLine();
        fName=fName.trim();
        System.out.println("Enter yuour lasName");
        String lastName= scan.nextLine();
        lastName=lastName.trim();
        System.out.println("FirtName is "+fName);
        System.out.println("last name is "+lastName);


    }
}
