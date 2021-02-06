package day49_AbstractionPractice_Interface.RemoteDriver;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();
}
