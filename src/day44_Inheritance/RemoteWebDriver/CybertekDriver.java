package day44_Inheritance.RemoteWebDriver;

public class CybertekDriver extends RemoteWebDriver{

    public CybertekDriver(){
        super("Cybertek Browser ","v78.8");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Cyberteke brwoser");
    }

    @Override
    public void close() {
        System.out.println("closing Cybertek browser");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+ "Cybertek browser");
    }
}
