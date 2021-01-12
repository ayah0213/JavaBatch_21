package day44_Inheritance.RemoteWebDriver;

public class ChromeBrowser extends RemoteWebDriver {


    public ChromeBrowser() {
        super("Chrome","V84.0.1");
    }
    @Override
    public void get(String URL){
    System.out.println("Opening Chrome driver "+URL);
    }

    @Override
    public void maximize(){
        System.out.println("Maximizing Chrome driver");
    }


    @Override  // we use Overide to use different implementation
    public void close(){
        System.out.println("Closing Chrome driver");
    }




}
