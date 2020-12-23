package tasks.Inheritence.Person;

public class People{

    // create an intance Variables
    public String name,jobID, jobTitle;
    public int age;
    public double hourlyRate;
    public char gender;

    // SetInfo
    public void setInfo(String name,  int age, char gender, String jobID,String jobTitle, double hourlyRate){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.jobID=jobID;
        this.jobTitle=jobTitle;
        this.hourlyRate=hourlyRate;

    }
    // creating an Instance methods
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void sleeps(int hours){
        System.out.println(name+" "+"is sleeps: "+hours+" hours");
    }


    public String toString() {
        return "People{" + "name is: " + name+
        ", age is " + age + ", gender is " + gender + ", jobId is " + jobID + "," +
          " jobTitle is " + jobTitle + ", and hourly rate is $" + hourlyRate + "}";
    }
}
