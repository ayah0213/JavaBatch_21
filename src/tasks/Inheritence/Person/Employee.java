package tasks.Inheritence.Person;

public class Employee extends People {

    public Employee(String name, int age, char gender, String jobId, String jobTitle, double hourlyRate){
        setInfo(name, age, gender, jobId, jobTitle, hourlyRate);
    }

    public void emplWorks(){
        System.out.println(name+" is working in Bollywood Production");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name +
                ", jobID='" + jobID +
                ", jobTitle='" + jobTitle +
                ", age=" + age +
                ", hourlyRate=" + hourlyRate +
                ", gender=" + gender +
                '}';
    }
}
