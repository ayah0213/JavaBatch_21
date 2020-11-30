package day16_ScannerString;

import java.util.Scanner;

public class BrowserSwitchStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String browser=scan.nextLine();


        switch (browser){
            case"chrome":
                System.out.println("Chrome");
            case"firefox":
                System.out.println("Firefox");
            case "opera":
                System.out.println("opera");
            case "Safari":
                System.out.println("Safari");
            default:
                System.out.println("invalid browser");
        }
    }
}
