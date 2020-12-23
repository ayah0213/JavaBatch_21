package day35_CustomClassContinue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasksArrayListPract1 {
    public static void main(String[] args) {

        // Create an Array of String calledcpunt names
        //write a programm that can remove all the countries names that has length of 10 or <
        String[] pastSSRcountrie = {"Turkmenistan", "Turkey", "Kzakhstan", "Tajikstan", "Uzbekistan", "Ukraine", "Belarussia", "Polland"};
        ArrayList<String> countryLists = new ArrayList<>(Arrays.asList(pastSSRcountrie));
        countryLists.removeIf(p -> p.length() > 10);
        System.out.println(countryLists);

        System.out.println("=====================================================");

        // Task 2
        // create an Array of LocalDAte
        // write a programm that can remove all the dates before August 15-2016
        LocalDate[] arr1 = {
                LocalDate.of(2010, 11, 23),
                LocalDate.of(2012, 11, 23),
                LocalDate.of(2013, 11, 23),
                LocalDate.of(2014, 11, 23),
                LocalDate.of(2015, 11, 23),
                LocalDate.of(2016, 7, 23),
                LocalDate.of(2017, 11, 23),
                LocalDate.of(2018, 11, 23),
                LocalDate.of(2019, 11, 23),
                LocalDate.of(2020, 11, 23),
        };

        LocalDate d1 = LocalDate.of(2016, 8, 15);
        ArrayList<LocalDate> dates = new ArrayList<>( Arrays.asList(arr1) );
        dates.removeIf( p ->  p.isBefore(d1) );

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");

        for(LocalDate each : dates){
            System.out.println(each.format(df));
        }



    }


}




