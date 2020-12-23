package day36_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employees {

    // creating instnace variables
    public  String name,jobTitle,ID, companyName;
    public double salary;
    public LocalDate hireDate;
    public char gender;

    public  void setInfo(String name,String jobTitle, String ID, String companyName,char gender,double salary, LocalDate hireDate){
     this.name=name; // .this keyword used for calling instance variables and assign them into local
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.companyName=companyName;
        this.gender=gender;
        this.salary=salary;
        this.hireDate=hireDate;
    }

    public void getInf(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        DecimalFormat decimal= new DecimalFormat("0.00");
        System.out.println("Nam: "+name+", Gender: "+gender+" , ID: "+ID+", Company Name: "+companyName+
                " ,Job title: "+jobTitle+", salary $"+salary+", Hired date "+hireDate.format(df));
    }

    public void working(){
        System.out.println(name+" is working");
    }

    public void meeting(){
        System.out.println(name+" is in meeting");
    }
}
