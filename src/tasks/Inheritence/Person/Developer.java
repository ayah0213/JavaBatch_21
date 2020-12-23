package tasks.Inheritence.Person;

public class Developer extends People {

    public Developer(String name,int age, char gender,String jobId, String jobTitle, double hourlyRAte){
        setInfo(name, age, gender, jobId, jobTitle, hourlyRAte);
    }

    public void devWorks(){
        System.out.println(name+" is working in CapitalOne as an developer");
    }

    public void devCode(){
        System.out.println(name+" is like to Coding");
    }


    public String toString() {
        return "Developer{" +
                "name='" + name +
                ", jobID='" + jobID +
                ", jobTitle='" + jobTitle +
                ", age=" + age +
                ", hourlyRate=" + hourlyRate +
                ", gender=" + gender +
                '}';
    }
}
