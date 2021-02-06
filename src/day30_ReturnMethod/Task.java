package day30_ReturnMethod;

public class Task {

    public static void main(String[] args) {
        posneg(3);
        grade(90);
    }


    public static void posneg(int a){
        if (a>0){
            System.out.println("positive");
        }else if(a<0){
            System.out.println("negative");
        }else if (a==0){
            System.out.println("number is equals to 0");
        }
    }


    public static void grade(double grade){
        if (grade>=100){
            System.out.println("Your grade is A");
        }else if (grade>=80){
            System.out.println("your grade is B");
        }else if (grade>=65){
            System.out.println("your grade is c");
        }else {
            System.out.println("FAIL");
        }
    }
}
