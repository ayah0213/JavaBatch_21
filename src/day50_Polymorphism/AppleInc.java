package day50_Polymorphism;

import day47_AbstractionIntro.Employee.Developer;
import day47_AbstractionIntro.Employee.Employee;
import day47_AbstractionIntro.Employee.Tester;
import day47_AbstractionIntro.Employee.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {


    Employee[] employees = {
            new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
            new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
            new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
            new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000)

    };
int countTester = 0;
int countDeveloper = 0;
for (Employee each : employees) {
    if (each instanceof Tester) {
        countTester++;
    }
    if (each instanceof Developer) {
        countDeveloper++;
    }
}
    System.out.println("Count od tester: "+countTester);
    System.out.println("Count of Developer :"+ countDeveloper);

    System.out.println("--------------------------------------------------------------");

    ArrayList<Employee> scrumMembers = new ArrayList<>();
    scrumMembers.addAll(Arrays.asList(employees));
    System.out.println(scrumMembers.size());

    scrumMembers.removeIf(p-> p instanceof  UberDriver);
    System.out.println(scrumMembers.size());
    System.out.println("---------------------------------------------------------------");
    ArrayList<Employee> testers= new ArrayList<>();
    ArrayList<Employee> developers = new ArrayList<>();

    // shortcut for each loop
      //  scrumMembers.forEach( each -> { if(each instanceof Tester) testers.add(each); else  developers.add(each); } );
   for(Employee each : scrumMembers){
       if (each instanceof Tester){
           testers.add(each);
       }else {
           developers.add(each);
       }
   }
}

}




