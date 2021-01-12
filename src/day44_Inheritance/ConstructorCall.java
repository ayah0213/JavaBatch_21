package day44_Inheritance;
class A{

    public A(){
        System.out.println("A"); // Constructor by default created
    }
}


class B extends A{

    public B(){
       // super();   is hidden here by default when u extending Class "A"
        System.out.println("B");
    }
}

public class ConstructorCall extends A{

    public ConstructorCall(){
        // super(); hidde Constructor of A class cause u extended it. First it will print "A" then after "C" -> like a chain
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorCall();
    }

}
