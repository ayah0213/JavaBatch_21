package day16_ScannerString;

import java.util.Scanner;

public class CountPOints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many people you re living with?");
        int points = 0;
        byte liveWithNum = scan.nextByte();

        if (liveWithNum > 0 & liveWithNum <= 12) {

            if (liveWithNum <= 2) {// only be 1 or 2ppl
                System.out.println("Live with less than 2 ppl");
            } else if (liveWithNum < 7) {// inlcude 3 6
                System.out.println("live with 3 or 6 ppl");
            } else {
                System.out.println("You live with more than 6 ppl");
            }

        } else {
            System.out.println("Invalid num of people");

        }
    }
}
