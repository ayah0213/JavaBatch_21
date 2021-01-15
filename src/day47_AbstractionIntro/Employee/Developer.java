package day47_AbstractionIntro.Employee;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer is writing creating codes");
    }

    @Override
    public void sleep() {
        System.out.println("Developer is sleeps 4-hours");
    }
}
