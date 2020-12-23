package day41_Encapsulation;

public class Data {

    public static String publicVariable="A";
    private static String privateVariable = "B";
    protected static String staticVAriables="D";
    static String defaultVAriable="C"; //default access modifier

    // make a Constructor
     Data(){

    }
    public static void publicMethod(){ // public method
        System.out.println("Public method");
    }

    private static void privateMethod(){ // private method
        System.out.println("Private method");
    }

    static void defaultMEthod(){ // default method
        System.out.println("DEfault method");
    }
}
