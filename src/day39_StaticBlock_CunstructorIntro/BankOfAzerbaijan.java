package day39_StaticBlock_CunstructorIntro;

import day37_InstanceClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;


public class BankOfAzerbaijan {
    public static void main(String[] args) {


        ArrayList<Employee> employes =new ArrayList<>();
        employes.add(HumanResource.empl1);
        employes.add(HumanResource.empl2);
        System.out.println(employes.get(0)); // gets st employees information which was added above


    }


}
