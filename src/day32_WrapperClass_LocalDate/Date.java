package day32_WrapperClass_LocalDate;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020, 11, 22);
        System.out.println(yesterday);

//        LocalDate d1=LocalDate.of(2020,2,29);
//        System.out.println(d1);

        System.out.println(yesterday.isLeapYear());// --->>> leap= true or false?


        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate DOB = LocalDate.of(1995, 01, 02);
        System.out.println(DOB.isLeapYear());



        String DOBarr[] = {"Marala", "VAsilisa", "Zainab", "Muhtar", "Ayahjon"};
        LocalDate[] DOBClassmates = {LocalDate.of(1966, 04, 04), LocalDate.of(1987, 11, 30),
                LocalDate.of(1999, 2, 02), LocalDate.of(1989, 12, 03),
                LocalDate.of(1995, 01, 02)};

        for (int i = 0; i <= DOBClassmates.length; i++) {
            System.out.println(DOBarr[i]+" "+ DOBClassmates[i]);
            System.out.println(DOBarr[i] +" was born on leap year: " +  DOBClassmates[i].isLeapYear()+"\n" );
        }





    }



    }


