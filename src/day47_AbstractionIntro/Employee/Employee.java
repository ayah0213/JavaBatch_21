package day47_AbstractionIntro.Employee;

public abstract class Employee extends Person{

    public String jobTitle, ID;
    public double salary;

    // generate Constructor of ParentClass
    public Employee(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


     public abstract void work();
    // public abstract vid sleepp also included here


    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
