package day38_CustomClassContinue;

public class SalaryCalculatorObjects {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.setInfo(55, 40, 6,23);
        System.out.println(salary1);

        SalaryCalculator salary2 = new SalaryCalculator();
        salary2.setInfo(40,40,6,23);
        System.out.println(salary2);
        System.out.println(salary1.equals(salary2));
    }
}
