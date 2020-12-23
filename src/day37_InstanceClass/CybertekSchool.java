package day37_InstanceClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {

    public static void main(String[] args) {
        // create 10 Cybrtek students
        Student s1=new Student();
        s1.setInfo("Diana",'F', LocalDate.of(1985,05,16),"12ab",4);

        Student s2=new Student();
        s2.setInfo("Volkan",'M', LocalDate.of(1986,05,12),"12abc",3.75);

        Student s3 = new Student();
        s3.setInfo("Sevara",'F', LocalDate.of(1989,03,16),"12abcd",1.25);

        Student s4 = new Student();
        s4.setInfo("Mohammad",'M', LocalDate.of(1996,04,11),"12abcde",3.75);

        Student s5 = new Student();
        s5.setInfo("Ayah",'F', LocalDate.of(1995,02,01),"12abcdef",2.25);

        Student s6 = new Student();
        s6.setInfo("Angelina",'F', LocalDate.of(1994,05,11),"12abcdefg",3);

        Student s7 = new Student();
        s7.setInfo("Saltanat",'F', LocalDate.of(1983,02,11),"12abcdefgh",2.00);

        Student s8 = new Student();
        s8.setInfo("Ahmet",'M', LocalDate.of(1998,04,21),"12abcdefghi",2.25);

        Student s9 = new Student();
        s9.setInfo("Marwan",'M', LocalDate.of(1986,04,11),"12abcdefghij",3);

        Student s10 = new Student();
        s10.setInfo("Aisha",'F', LocalDate.of(1986,05,11),"12abcdefghijk",2.75);

        Student[] CybertekStudents ={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        System.out.println(Arrays.toString(CybertekStudents));
        System.out.println("-----------------------------------------");

        // prinnt Students who's GP >=3
        for (Student each : CybertekStudents){
            if (each.gpa >=3 ){
                System.out.println("Students with who's GP is higher or equals to 3 : "+each);
            }
        }
        System.out.println("-------------------------------------------");
        // print out whose GP between 2 & 3
        ArrayList<Student> cyberList= new ArrayList<>(Arrays.asList(CybertekStudents));
        // here we findin both number inside of list
        cyberList.removeIf(p -> p.gpa==2 || p.gpa==3);
        System.out.println("Students whos's GP is between 2 & 3: "+"\n"+cyberList);

        System.out.println("---------------------------------------------------------------");

        // create Male ArrayList and print only Male CybertekStudents
        ArrayList<Student> male=new ArrayList<>();
        ArrayList<Student> female = new ArrayList<>();

        // here we adding 2st all students into new created Arraylis of F & M gender
        female.addAll(Arrays.asList(CybertekStudents));
        male.addAll(Arrays.asList(CybertekStudents));

        // here we have to print them out
        female.removeIf(p-> p.gender=='M');
        System.out.println("Here is list of of female students :"+female);
        male.removeIf(p-> p.gender=='F');
        System.out.println("Here is list of male students : "+male);

        System.out.println("--------------------------------------------------------------------");

         //finnding youngest  and oldest students from list
        LocalDate youngest=cyberList.get(0).DOfB;
        LocalDate oldest= cyberList.get(0).DOfB;

        String youngestStudent=null;// null is default value of nonPrimitive
        String oldestStudent=null;
//
//        for (Student each: cyberList){
//            if(each.DOfB.isAfter(youngest)){
//                youngest=each.DOfB;
//                youngestStudent=each;
//
//            }
//            if (each.DOfB.isBefore(oldest)){
//                oldest=each.DOfB;
//                oldestStudent=each;
//            }
//        }
        System.out.println("Youngest student: "+youngest);
        System.out.println("Oldest student: "+oldest);


        System.out.println("-----------------------------------------------");
        // find highest GPA student
        double highestGPA = cyberList.get(0).gpa;
        for (Student eachStudent: cyberList){
            double eachGPa= eachStudent.gpa;
            highestGPA = Math.max(eachGPa, highestGPA);
        }
        System.out.println("HIghest GPA: "+highestGPA);


        System.out.println("-----------------------------------------------------------");
        //finding minimum GPA
        double minGPA=cyberList.get(0).gpa;
        for (Student eachStudent:cyberList){
            double eachGPA=eachStudent.gpa;
            minGPA=Math.min(eachGPA,minGPA);
        }
        System.out.println("Minimum GPA: "+minGPA);


    }
}
