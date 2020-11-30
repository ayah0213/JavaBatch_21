package day32_WrapperClass_LocalDate;

public class VaLueOfMEthods {

    public static void main(String[] args) {

        String s1="123";
        int num1 = Integer.valueOf(s1);
        Integer num2=Integer.valueOf(s1);// none
        System.out.println(num1+1);

        String s2 ="2.5";
        double num3=Double.valueOf(s2);
        System.out.println(num3+1);

        String s3="true";
        boolean r1=Boolean.valueOf(s3);// unbxing

        System.out.println(r1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
