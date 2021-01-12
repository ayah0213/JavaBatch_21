package day44_Inheritance.RemoteWebDriver;

public class FireFoxDriver extends RemoteWebDriver {

    public FireFoxDriver(){
        super("Firefox Browser","v83.0.0");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public void get(String URL) {
        super.get("opening "+ URL+" from FireFox");
    }
}
