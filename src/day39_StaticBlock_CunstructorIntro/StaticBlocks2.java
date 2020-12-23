package day39_StaticBlock_CunstructorIntro;

public class StaticBlocks2 {
    public static void main(String[] args) {
        System.out.println("Main method");
    }



    // no matter what STATIC BLOCK always get exceted 1-st
    static {
        System.out.println("Static Block");
    }

    static {
        System.out.println("Static block 2");
    }

    static {
        System.out.println("Static block 3");
    }


}
