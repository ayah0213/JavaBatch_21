package day37_InstanceClass;

public class Employee {

    public String name, company, jobTitle, gender, ID;
    public int weeklyhours;
    public double hourlyRate, salary;

    public void setInfo(String name, String company, String jobTitle, String gender, String ID, int weeklyhours, double hourlyRate, double salary) {
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.ID = ID;
        this.weeklyhours = weeklyhours;
        this.hourlyRate = hourlyRate;
        this.salary = salary;
    }


    public double calculateSalary(){
        return hourlyRate + weeklyhours * 52;



    }

    public double calculateTAx(double stateTaxRate, double federalTAxRate){
        return calculateSalary() * stateTaxRate+calculateSalary() * federalTAxRate;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
