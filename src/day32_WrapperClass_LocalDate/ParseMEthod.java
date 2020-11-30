package day32_WrapperClass_LocalDate;

public class ParseMEthod {
    public static void main(String[] args) {

        String data="123";


        System.out.println(data+3);// 1233

        int num1 =Integer.parseInt(data);

       Integer num2= Integer.parseInt(data);


        System.out.println(num1+3);



        String s2="2.5";
        double d1 =Double.parseDouble(s2);// none

        Double d2=Double.parseDouble(s2);// Autoboxing
        System.out.println(d1+1);


        String s3="true";
        boolean r1= Boolean.parseBoolean(s3);// none
        Boolean r2=Boolean.parseBoolean(s3);// autoboxing

        System.out.println(!r1);

        String s4="False";

        boolean r3=Boolean.parseBoolean(s4);





    }
}
