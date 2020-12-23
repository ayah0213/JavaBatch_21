package day38_CustomClassContinue;

public class Developers {

    public String name, ocupation, employeeId, company;
    public boolean hasCodingSkills;
    public double salary;

    public void setDevInfo(String name, String ocupation, String employeeId, boolean hasCodingSkills, double salary) {
        this.name = name;
        this.ocupation = ocupation;
        this.employeeId = employeeId;
        this.hasCodingSkills = hasCodingSkills;
        this.salary = salary;


    }
    public static Boolean codingSkills=true;


    public static String getICompanyInfo(String company){
       return "Compay where they all works is : "+company;

    }

    public String getInfo() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", hasCodingSkills=" + hasCodingSkills +
                ", salary=" + salary +
                '}';
    }
}
