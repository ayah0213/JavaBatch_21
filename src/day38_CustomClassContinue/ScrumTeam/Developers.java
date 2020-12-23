package day38_CustomClassContinue.ScrumTeam;

public class Developers {

    public String name, ID, jobTitle;
    public double salary;
    public char gender;
    public String companyName;

    public static boolean hasCodingSkills= true;

    public void setInfo(String name, String ID, String jobTitle, double salary, char gender, String companyName) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixingBug(){
        System.out.println(jobTitle+" "+name+" is fixing bug");
    }


    public String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}
