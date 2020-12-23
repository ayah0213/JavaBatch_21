package day40_Constructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MySalaries {

    public static void main(String[] args) {


        SalaryCalculator salary1 = new SalaryCalculator(40, 55, 6, 20);

        SalaryCalculator salary2 = new SalaryCalculator(40, 55, 0, 20);

        SalaryCalculator salary3 = new SalaryCalculator(45, 50, 8, 18);

        SalaryCalculator salary4 = new SalaryCalculator(35, 40, 9, 17);

        SalaryCalculator salary5 = new SalaryCalculator(40, 40, 6, 20);
        System.out.println(salary1);

        ArrayList<SalaryCalculator> salaryList = new ArrayList<>();
        salaryList.add(salary1);
        salaryList.add(salary2);
        salaryList.add(salary3);
        salaryList.add(salary4);
        salaryList.add(salary5);
        System.out.println(salaryList);

        System.out.println("==========================================");


        double maaxSalaryofEmpl = salaryList.get(0).salaryAfterTax;
        for (SalaryCalculator each : salaryList) {
            if (each.salaryAfterTax == maaxSalaryofEmpl) {
                maaxSalaryofEmpl = each.salaryAfterTax;
            }
        }
        System.out.println("The Maximum salary from the above list is salary : " + maaxSalaryofEmpl);
        System.out.println("===========================================");

        double minSalaryofEmpl = salaryList.get(0).salaryAfterTax;
        for (SalaryCalculator each : salaryList) {
            minSalaryofEmpl = Math.min(each.salaryAfterTax, minSalaryofEmpl);
        }

        System.out.println("Minimum salary from above list : " + minSalaryofEmpl);

    }
}