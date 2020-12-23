package day38_CustomClassContinue;

public class SalaryCalculator {
    /*
       2. Create a custom class called SalaryCalculator
                    Attributes:
                        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
                    Methods:
                        calculateSalary: returns the annual salary
                        calculateStateTax: returns the total tax
                        calculateFederalTax: returns the total tax
                        calculateTotalTax: returns the total tax
                        calculateSalaryAfterTax: returns the salary after calculator
                        setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and iitializes all instances
                        toString() method

     */
    public double   hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=(stateTaxRate > 1)? stateTaxRate/100 : stateTaxRate; // just incase of if user inputs will be integer
        this.federalTaxRate=(federalTaxRate > 1) ?federalTaxRate/100 : federalTaxRate;
        this.salary=calculateSalary();
        this.salaryAfterTax=calculateSalaryAfterTax();
    }

    public double calculateSalary(){
        return hourlyRate * weeklyHours *52;
    }

    public double calculateStateTax(){
        return  salary * stateTaxRate;
    }

    public double calculateFedeTax(){
        return  salary * federalTaxRate;
    }

    public  double calculateTotalTax(){
        return calculateStateTax() + calculateFedeTax();
    }

    public double calculateSalaryAfterTax(){
        return salary-calculateTotalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){
      return this.salary ==  s1.salary;
    }
}
