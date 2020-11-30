package day32_WrapperClass_LocalDate;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("what is 'First person' date of birth?");
        LocalDate dofB1=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());


        System.out.println("what is the second person date of birth");
        LocalDate dofb2=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        if (dofB1.isBefore(dofb2)) {
            System.out.println("1 st person is older");
        }else if (dofb2.isBefore(dofB1)){
            System.out.println("2nd person is older");
        }else {
            System.out.println("same age");
        }
//
        // after 30 years how old they will be?
        int age1=LocalDate.now().plusYears(30).getYear()-dofB1.getYear();
        int age2=LocalDate.now().plusYears(30).getYear()-dofb2.getYear();

//        // after 30 years :
//        int after=age1+30;
//        int after2person=age2+30;
        // or u can use this one
        System.out.println("After 30 years 1st person will be "+age1);
        System.out.println("After 30 years 2nd person will be "+age2);

        LocalDate Dofb3=LocalDate.of(1980,12,5);
        System.out.println(calculateAge(Dofb3,20)+"years old");

    }
        /*
        parameters:
        DOb
        year

         */
public static int calculateAge(LocalDate Dofb, int year){
    return  LocalDate.now().plusYears(30).getYear()-Dofb.getYear();
}


}
