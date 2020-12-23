package day38_CustomClassContinue.ScrumTeam;

public class Tester {

    public String name, ID, jobTitle;
    public double salary;
    public char gender;
    public String companyName;

    public void setInfo(String name, String ID, String jobTitle, double salary, char gender, String companyName) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
        this.companyName = companyName;
    }

    public void smokeTesting(){
        System.out.println(name+" is performing smoke testing");
    }

    public void createTcket(){
        System.out.println(name+" is creating ticket");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
