package day16_ScannerString;

public class String_Equals {
    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str==str2);
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.equalsIgnoreCase("jira"));

        // comparing values


    }
}