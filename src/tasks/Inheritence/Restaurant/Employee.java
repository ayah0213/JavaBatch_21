package tasks.Inheritence.Restaurant;

public class Employee {

    public String name, title, employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public void setInfo(String name, String title, String employeeID, double hourlyRate, boolean fullTime){
        this.name = name;
        this.title = title;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }


    public void work(){
        System.out.println(name+" is working as a-"+title);
    }


    public double calculationSalary(double hourlyRate, double hours) {
        return hourlyRate * 40 * 52;
    }

    public String toString() {
        double hours=0;
       if (hours<=40){
            System.out.println(employeeID+" is full time employee");
        }else {
            System.out.println("part time employee");
        }
        return "Employee{" +
                "name='" + name +
                ", title='" + title +
                ", emplID='" + employeeID+" and he is " +fullTime +
                ", hourlyRate=" + hourlyRate +
                "}";
    }

}
