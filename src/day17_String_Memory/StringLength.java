package day17_String_Memory;

public class StringLength {
    public static void main(String[] args) {

        String s="jbdjkabjdvajkdvavdKHKHKJbnkadn";
        String s2="word";
        System.out.println(s.length());
        System.out.println(s2.length());
        int length=s.length();
        int length2=s2.length();

        System.out.println(length==s2.length());// false
        System.out.println(length==s.length());// false
    }
}
