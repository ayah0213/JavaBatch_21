package day53_Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo=new LinkedHashMap<>();
        employeeInfo.put("Mayah",100.000);// adding KEY and VAlue
        employeeInfo.put("Ayah",98.000);// adding KEY and Value
        employeeInfo.put("Didar",34.00);
        employeeInfo.put("Aydin",98.000);
        employeeInfo.put("Mayah",87.00);// value is duplicted even with different salary re not allowed in MAP
        employeeInfo.put("Mayah",100.00);// duplicated values are allowed in MAP data structure
        employeeInfo.remove("Ayah");// removes 1 pair from maps's List
        System.out.println(employeeInfo.size());// gets the size of Pairs which used in map's list
        System.out.println(  employeeInfo.get("Mayah"));// we call employee by Key name
        System.out.println(employeeInfo.containsKey("Mayah"));// return BOOLEAn true/false
        System.out.println(employeeInfo.containsValue(100.00));// return boolean whichever employee earns 100k
      //employeeInfo.clear(); // size of MAp lis will becleared to 0



        // print out each  employee with salary
        for (String eachKey: employeeInfo.keySet()){
            System.out.println(eachKey+" : "+employeeInfo.get(eachKey));
        }

        employeeInfo.put("Mustafa",105000.0);
        employeeInfo.put("Emre",103000.0);
        employeeInfo.put("Apo",100000.0);

        double max = Double.MIN_VALUE; double min=Double.MAX_VALUE;
        String nameMax=""; String nameMIn="";

        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if (eachSalary>max){
                max=eachSalary;
                nameMax=eachName;
            }
            if (eachSalary<min){
                min=eachSalary;
                nameMIn=eachName;
            }
        }
        System.out.println(nameMax+" : "+max);
        System.out.println(nameMIn+" : "+min);


        System.out.println("==============================================================================");
        System.out.println(employeeInfo);
        // 1 way to get value of all employees
        // employeeInfo.values().forEach(p-> System.out.println(p));

        // 2nd way to get values of ech employee
        for (Double eachValue: employeeInfo.values()){
            System.out.println(eachValue);
        }
    }
}
