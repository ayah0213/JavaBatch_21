package day47_AbstractionIntro.Employee;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("tester is testing application");
    }

    @Override
    public void sleep() {
        System.out.println("tester sleeps 8 hours");
    }
}
