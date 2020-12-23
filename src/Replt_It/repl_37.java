package Replt_It;

import java.util.Scanner;

public class repl_37 {
    /*
    The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int couponsCount=scan.nextInt();  // coupcnts

          if (couponsCount<3 ){
                System.out.println("Not enough coupons");
            }else {
                int candybars=couponsCount/10;
                int remainingCoupons=couponsCount%10;
                int gumballs=remainingCoupons/3;

                System.out.println("Number of Candies: "+candybars);
                System.out.println("Number of Gumballs: "+gumballs);
    }




    }
}
