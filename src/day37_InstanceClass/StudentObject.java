package day37_InstanceClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String ("Batch 21");

        Student student1= new Student();
        student1.setInfo("Aaron",'m',LocalDate.of(2003,12,12),"A056",3.75);

        System.out.println(list);
        System.out.println(str);

        System.out.println(student1); // it it will print all get.info cause its already assigned in return type of instace toString method

        System.out.println("==========================");
        Student student2= new Student();
        student2.setInfo("Daniel",'M', LocalDate.of(1995,02,01),"12311348648d",12.5);
        // gets all infor of student2
        System.out.println(student2);

        System.out.println("========================================");


        Student student3= new Student();
        student3.setInfo("Bilal",'F',LocalDate.of(1993,02,03),"15468u",3.25);
        System.out.println(student3);


        // now we gonna add all those 3 studnets Informations and add them together  in 1 List
        ArrayList<Student> listOfstudents = new ArrayList<>(Arrays.asList(student1, student1, student3));
        System.out.println(listOfstudents);

        System.out.println("==============================");


        Student[] students ={student1, student2, student3};
        System.out.println(Arrays.toString(students));

        System.out.println("=================================");

        //find student who has ID number of'15468u'

        for (Student each: students){
            if (each.ID.equalsIgnoreCase("15468u"));{
                System.out.println(each);
            }
        }

        System.out.println("====================");
        Student s1 = new Student();
        Student s2=s1;

        s1.setInfo("BiGal",'M',LocalDate.of(1993,02,13),"15468u",3.28);
        student3.setInfo("Bilal",'F',LocalDate.of(1993,02,03),"15485u",3.05);

        System.out.println(s2);// wont print s1 it will print s1 cause we re reassined


    }
}