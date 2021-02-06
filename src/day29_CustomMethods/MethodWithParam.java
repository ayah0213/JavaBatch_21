package day29_CustomMethods;

public class MethodWithParam {

    public static void main(String[] args) {

        int age=35;
        alcoholEligibility(35);
        int age2=12;
        alcoholEligibility(12);
        System.out.println("My current age is: ");
        calculateAge(2021, 2020);

    }




    public static void alcoholEligibility(int age){
        if (age>=21){
            System.out.println("Congrats u re eligible to buy alchol");
        }else {
            System.out.println("sorry you re not eligible to buy this product");
        }
    }

    public static void calculateAge(int birthYear, int currentYear){
        if (birthYear<currentYear){
            System.out.println("your age is:"+(currentYear-birthYear));
        }else{
            System.out.println("Invalid birthyear");
        }


    }
}
