package day40_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee  employee2= new Employee("Ercan","Sdet");

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
