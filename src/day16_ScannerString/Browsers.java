package day16_ScannerString;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a browser type");
        String browserType=scan.next();

        if (browserType.equalsIgnoreCase("safari")){
            System.out.println("Safari_is opening");
        }else if (browserType.equalsIgnoreCase("chrome")){
            System.out.println("Chrome_is opening");
        }else if (browserType.equalsIgnoreCase("firefox")){
            System.out.println("Forefox_is opening");
        }else if (browserType.equalsIgnoreCase("opera")){
            System.out.println("Opera_is opening");
        }else {
            System.out.println("Browser type_isnt valid sorry@!!!!");
        }
    }
}
