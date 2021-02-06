package day49_AbstractionPractice_Interface.RemoteDriver;

public class TestCases {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
        System.out.println("----------------------");
        FireFoxBrowser firefox = new FireFoxBrowser();
        firefox.get("https://www.fireFox.com");
        firefox.takeScreenShots("Screen");
        firefox.close();




    }
}
