package tasks.Inheritence.Person;

public class Tester extends People{

   public Tester(String name, int age, char gender, String jobId, String jobTItle, double hourlyRate){
       setInfo(name, age, gender, jobId, jobTItle, hourlyRate);
   }

   public void testerWorks(){
       System.out.println(name+" is working in CyberMyber company as a tester");
   }

   public void testing(){
       System.out.println(name+" just furious about Testing");
   }


    public String toString() {
        return "Tester{" +
                "name='" + name +
                ", jobID='" + jobID +
                ", jobTitle='" + jobTitle +
                ", age=" + age +
                ", hourlyRate=" + hourlyRate +
                ", gender=" + gender +
                '}';
    }
}
