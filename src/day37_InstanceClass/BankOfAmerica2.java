package day37_InstanceClass;

public class BankOfAmerica2 {
    public static void main(String[] args) {

        Employee employee1 =new Employee();
     employee1.setInfo("Ayah","BOFA","SDET","F","1546554g",40,40.000,76.00);

        System.out.println(employee1);

        double totalTax = employee1.calculateTAx(0.6,0.22);

        System.out.println("Total Tax: "+totalTax);
        System.out.println("Salary after Tax : "+(employee1.salary - totalTax));
    }
}
