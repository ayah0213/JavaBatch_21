package day48_AbtsractionPractice;

public interface InterfaceIntro {

    int a= 100; // automatically sttaic var

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceIntro.a);

       //  a=100;
    }

    /*
    Interface  what we cant have :
     cant have objects,
     contstructir, instance methods,
     instance variables
     methods only static, abstract, public default
     main purpose of Interface is to achieve Abstraction

    What we can have :
     variables static by default,
     acess modifiers public and static by default,
     variale by feault Final
     Interface its a bluePrint of the class

     */
}
