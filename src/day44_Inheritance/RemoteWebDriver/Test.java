package day44_Inheritance.RemoteWebDriver;

public class Test {

    public static void main(String[] args) {
       // ChromeBrowser driver = new ChromeBrowser();
        FireFoxDriver driver= new FireFoxDriver();
        //CybertekDriver driver  = new CybertekDriver();
       driver.get("Apple");
       driver.maximize();
       driver.close();
    }
}
