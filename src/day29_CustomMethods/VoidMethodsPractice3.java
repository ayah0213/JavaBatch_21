package day29_CustomMethods;

import java.util.Scanner;

public class VoidMethodsPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please eneter you data");
        citizenshipEligibilyt(scan.next(), scan.nextInt(), scan.nextBoolean());
citizenshipEligibilyt("USA",32,false);
citizenshipEligibilyt("Turkmenistan",32,true);
citizenshipEligibilyt("USA",12,true);
    }

    public static void citizenshipEligibilyt(String  citizenship, int age, boolean isAlive){
        if (citizenship.equalsIgnoreCase("USA")){
            if (isAlive){
                if (age>=18){
                    System.out.println("YOu re eligible");
                }else {
                    System.out.println("You must be 18 y old");
                }
            }else {
                System.out.println("Died person isnt able to vite ");
            }
        }else {
            System.out.println("You must be USA CITIZENSHIP");
        }
    }
}
