package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public static  int weekdays, numberofWeeks;
    public double weeklyhours, hourlyRate, stateTAxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static {
        numberofWeeks=5;
        numberofWeeks=52;
    }

    public SalaryCalculator(double weeklyhours, double hourlyRate, double stateTAxRate, double federalTaxRate) {

        if (stateTAxRate > 1){
            stateTAxRate /=100;
        }
        if (federalTaxRate > 1){
            federalTaxRate/=100;
        }
        this.weeklyhours = weeklyhours;
        this.hourlyRate = hourlyRate;
        this.stateTAxRate = stateTAxRate;
        this.federalTaxRate = federalTaxRate;
        salary = weeklyhours * hourlyRate * numberofWeeks;
        totalTax = (stateTAxRate+federalTaxRate)*salary;
        salaryAfterTax = salary - totalTax;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                "weeklyhours= " + weeklyhours +
                ", hourlyRate= $" + hourlyRate +
                ", stateTAxRate= " + stateTAxRate +
                ", federalTaxRate= " + federalTaxRate +
                ", salary= " + df.format(salary )+
                ", salaryAfterTax= " + df.format(salaryAfterTax) +
                ", totalTax= " + df.format(totalTax) +
                '}';
    }
}
