package day49_AbstractionPractice_Interface.RemoteDriver;

public class ChromeDriver extends RemoteDriver {

    @Override
    public void javaScriptExceture(String script) {
        System.out.println("Script "+script+" is excecuted");
    }

    @Override
    public void takeScreenShots(String name) {
        System.out.println("Taking screenshot on chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting chrome");
    }
}
