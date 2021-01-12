package day44_Inheritance.RemoteWebDriver;

public class RemoteWebDriver {

    public String name, version;


    public RemoteWebDriver(String name, String version){
        this.name = name;
        this.version=version;
    }

    public void maximize(){
        System.out.println("Maximize Webdiver");
    }

    public void close( ) {
        System.out.println("Close Webdriver ");
    }

    public void get(String URL){
        System.out.println("Opening default driver "+URL+ " remote driver");
    }

    @Override
    public String toString() {
        return "RemoteWebDriver{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
