package day35_CustomClassContinue;

public class prime {


    public static void main(String[] args) {

        int num=25;

        boolean isPrime=true;

        for (int i = 2; i < num; i++) {
            if (num % i== 0){
                isPrime=false;
            }
        }
    }
}
