package day53_Collection;

import java.time.LocalDate;
import java.util.*;

public class MapPractice3 {
    /*

Tasks:
    1. create a map that can contain student name and student' score
            put 5 of your friends names and thier scores
            print out the names of the students who made less than 80
    2. create a map that can contains name and Date Of Birth.
            put 5 of your classmates' names and thier date of birth
            print out the names of the students who were born before 1980 January 1st
    3. create a map that can contain names of counties and thier capitals
                use for each loop to print out all the capitals

     */


    public static void main(String[] args) {
        Map<String, Integer> students = new TreeMap<>();
        students.put("Ayah", 77);
        students.put("Mayah", 67);
        students.put("Rayah", 96);
        students.put("Ayan", 87);
        students.put("Viyan", 97);
        students.put("Kyian", 100);
        students.put("Jyia", 100);
        students.put("Miyah", 77);
        students.put("Liayah", 96);
        students.put("Sian", 67);
        students.put("Biiyan", 87);
        students.put("Zyian", 80);

        List<String> earlyBiirds = new ArrayList<>();// >=80
        List<String> angryBirds = new ArrayList<>();// <=80

        for (String eachValue : students.keySet()) {
            int score = students.get(eachValue);
            if (score >= 80) {
                earlyBiirds.add(eachValue);
                System.out.println("Early Birds: " + eachValue);
            }
            if (score <= 80) {
                angryBirds.add(eachValue);

            }
            System.out.println("Easrly birds: " + earlyBiirds);
            System.out.println("Angry birds: " + angryBirds);
        }


        System.out.println("-----------------------------------------------------------------------------------");

        LinkedHashMap<String, LocalDate> birthDays = new LinkedHashMap<>();
        birthDays.put("Jimmy", LocalDate.of(2018, 2, 5));
        birthDays.put("Farzam", LocalDate.of(2010, 2, 2));
        birthDays.put("Dean", LocalDate.of(1995,3,5));
        birthDays.put("Muhtar", LocalDate.of(1976, 5, 19));
        birthDays.put("Ercan", LocalDate.of(1974,3,3));
        birthDays.put("Ayder", LocalDate.of(1989, 4, 4));
        birthDays.put("Ramiz", LocalDate.of(1983,3,12));

        LocalDate youngest =LocalDate.of(1900,1,1);
        String nameYoung="";

        LocalDate oldest=LocalDate.now();
        String eldest="";

      for (String eachname : birthDays.keySet()) {
          LocalDate DOB = birthDays.get(eachname);
          if (DOB.isBefore(LocalDate.of(1980, 1, 1))) {
              System.out.println(eachname + " : " + DOB);
          }
          if (DOB.isAfter(youngest)) { //to find the youngest
              youngest = DOB;
              nameYoung = eachname;
          }
          if (DOB.isBefore(oldest)) { /// to find teh oldest
              oldest = DOB;
              eldest = eachname;

          }
      }
        System.out.println("Youngest = " + nameYoung);
        System.out.println("Oldest = " + eldest);

        System.out.println("==========================================================");



        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("United States", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("USA", "Washington");
        countries.put("The Czech Republic", "Prague");
        countries.put("España", "Madrid");
        countries.put("Brazil","Brasilia");
        countries.put("Germany", "Berlin");
        countries.put("Pakistan", "Islamabad");


        System.out.println(countries);

        //  countries.values().forEach( p -> { System.out.println(p.toUpperCase()); }  );

        for (String each: countries.values()){
            System.out.println(each.toUpperCase());
        }

        for (String eachcountry : countries.keySet()){
            String capital = countries.get(eachcountry);
            if (capital.equals("Brasilia")){
                System.out.println(eachcountry);
            }
        }


        LinkedHashMap<String, Integer> sdets= new LinkedHashMap<>();
        sdets.put("Mahrijemal",15000);
        sdets.put("Ayjemal",15000);
        sdets.put("Guljemal",15000);
        sdets.put("Yarjemal",15000);

        for (String eachKey : sdets.keySet()){
            Integer value = sdets.get(eachKey);
            sdets.replace(eachKey, value - 500 );
        }

        System.out.println("sdets = " + sdets);


    }

}
