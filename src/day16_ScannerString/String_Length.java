package day16_ScannerString;

public class String_Length {
    public static void main(String[] args) {

        String s="jbavhdbahdihdiadjka dnd  d";
        String s2="word";

        System.out.println(s.length());// 1st string leggth 26
        System.out.println(s2.length());// 2nd word legth  4
        int length =s.length(); // returns FALSE

        System.out.println(length==s2.length());
        System.out.println(length==s.length());// reasigned TRUE

    }
}
