package day18_StringMethods;

public class StringMethods {

    public static void main(String[] args) {

        String str="JAva is programming language";

        char firstCahr=str.charAt(0);
        char lastChar=str.charAt(str.length()-1);

        System.out.println("First character "+firstCahr);
        System.out.println("LAst Character "+lastChar);

        System.out.println("=============================");

        String str2="Batch 21 is the best";
        char secCharat=str2.charAt(1);
        char lastSecondCahr=str2.charAt(str2.length()-2);
        System.out.println("secCharat = " + secCharat);
        System.out.println("lastSecondCahr = " + lastSecondCahr);

    }

}
