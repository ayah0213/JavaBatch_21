package day17_String_Memory;

public class StringMethods {

    public static void main(String[] args) {
        String str="jira";
        String str2=new String("jira");

        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase("Java"));
        System.out.println(str.charAt(3));

    }
}
