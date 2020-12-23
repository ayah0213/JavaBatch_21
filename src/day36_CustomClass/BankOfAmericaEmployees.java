package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmericaEmployees {

    // Alt + insert for window



    public static void main(String[] args) {

        Employees[] employees =
                {new Employees(),
                        new Employees(),
                        new Employees(),
                        new Employees(),
                        new Employees()
                };

        employees[0].setInfo("Mariya","SDET","12023fg45","BOfA",'F',100000,
                LocalDate.of(2009,12,10));
        employees[1].setInfo("Aysel","BA","12413fg45","BOfA",'F',103000,
                LocalDate.of(2002,02,20));
        employees[2].setInfo("Maya","DEV","123fg78545","BOfA",'F',105000,
                LocalDate.of(2018,12,20));
        employees[3].setInfo("Muhtar","DESIGN","1231055fg45","BOfA",'M',106000,
                LocalDate.of(2000,02,20));
        employees[4].setInfo("Marwan","PO","123f741g45","BOfA",'M',106000,
                LocalDate.of(2010,02,10));
        employees[5].setInfo("Michael","Manual-Tester","123f5825","BOfA", 'M', 100700,
                LocalDate.of(2020, 02, 20));


        for (Employees each : employees) {
            each.getInf();
        }




        System.out.println("=====================================================");
        ArrayList<Employees> SDETSandDEV=new ArrayList<>(Arrays.asList(employees));

        SDETSandDEV.removeIf(p -> !(p.jobTitle.equalsIgnoreCase("DEV") || p.jobTitle.equalsIgnoreCase("SDET")));
                             // removes the employees IF job title of the employees isnt SDET && DEV

        for (Employees each: SDETSandDEV){
            System.out.println(each.name+" : "+ each.jobTitle+" $"+each.salary);
        }


        System.out.println("=================================================");
        ArrayList<Employees> richPeople= new ArrayList<>();//u can aslo use shortcut of adding all-> new ArrayList<>(Arrays.asList(employees));
        richPeople.addAll(Arrays.asList(employees));
        // another way of adding -> for(Employee each: employees) richPeople.add(each)

        richPeople.removeIf( p ->p.salary < 200000); // we want to remove salaries less than 200.000




        System.out.println("======================================================");
        double maxSalary = employees[0].salary; // assume that 1st employees salary is max
        String name=" ";

        for (Employees each:employees){
            // Math.max(maxSalary, each.salary); u can find max also with math instead if statement
            if (each.salary > maxSalary){
                maxSalary=each.salary;
                name=each.name;
            }
        }
        System.out.println(maxSalary);
    }

    }