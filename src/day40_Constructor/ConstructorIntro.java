package day40_Constructor;

public class ConstructorIntro {

    static int b;
    public ConstructorIntro(int a){
        System.out.println("Constructor with int arg");
        b=200;
    }

    int a =100;

    public static void main(String[] args) {
        System.out.println("Hello");

        int num = new ConstructorIntro(10).a;
       // ConstructorIntro obj2 = new ConstructorIntro("HEllo");
    }
}
