package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ArrayList {

    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E, h:mm a,MMMM/dd/yyyy");
        LocalDateTime d1=LocalDateTime.of(2020,11,24,13,0);

        System.out.println(d1.format(dtf).replaceFirst("PM","pm"));

        System.out.println("===================================");
        
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM-dd, E");

        LocalDate[] days = new LocalDate[5];

        for (int i = 0; i <= days.length-1; i++) {
               days[i]=LocalDate.now().plusDays(i+1);
        }
        System.out.print(Arrays.toString(days));

        for (LocalDate each : days) {
            System.out.println(each.format(df));
            
        }

        System.out.println("====================================================");


        String[] friend = {"Saidullo", "Delgira", "Feyza", "Kubra", "Tamerlan","Ayah"};
        LocalDate[] dob = {LocalDate.of(1991,9,25),
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005, 04,20),
                LocalDate.of(2010, 05,25)};

        String nameOfOlder= friend[0];
        LocalDate ageOfOlder=dob[0];

        String nameofYoungest=friend[0];
        LocalDate younger=dob[0];

        for (int i = 0; i <=dob.length-1 ; i++) {

            if (dob[i].isBefore(ageOfOlder)) {
                ageOfOlder = dob[i];
                nameOfOlder = friend[i];
            }

            if (dob[i].isAfter(younger)) {
                younger = dob[i];
                nameofYoungest = friend[i];
            }
            System.out.println(nameOfOlder);
            System.out.println(nameofYoungest);
        }



    }
    
    
}
