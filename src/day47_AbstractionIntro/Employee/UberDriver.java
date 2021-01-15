package day47_AbstractionIntro.Employee;

public class UberDriver extends Employee {

    public UberDriver(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, "uber driver", ID, salary);
    }

    @Override
   public void work() {
        System.out.println("Works more than 10 hours driving people");
    }

    @Override
    public void sleep() {
        System.out.println("Sleepss in the car always");
    }
}
