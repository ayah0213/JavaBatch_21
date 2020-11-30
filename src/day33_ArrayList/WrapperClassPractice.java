package day33_ArrayList;

public class WrapperClassPractice {
    public static void main(String[] args) {

        String str = "a1b2c3"; // 1=49, 2=50. 3=51
        int sum = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        System.out.println("sum " + sum);


    }
}