package tasks.Inheritence.Person;

public class UnemployedPerson extends People{

    public UnemployedPerson(String name, int age, char gender, String jobId,String jobTitle, double hourlyRate){
        setInfo(name, age, gender, jobId, jobTitle, hourlyRate);
    }

    public String toString() {
        return "UnemployedPerson{" +
                "name='" + name +
                ", jobID='" + jobID +
                ", jobTitle='" + jobTitle +
                ", age=" + age +
                ", hourlyRate=" + hourlyRate +
                ", gender=" + gender +
                '}';
    }
}
