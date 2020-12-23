package day39_StaticBlock_CunstructorIntro;

import day37_InstanceClass.Employee;

public class StaticBlockIntro {

    public static String company;

    public static Employee employee1 =  new Employee();

    public static int b;
    public static  boolean isEmployee;
    public int a;
    // static member


   //  SYNTAX OF STATIC BLOCK
    static {
        company = "Capital one";
        isEmployee = true;
        employee1 = new Employee();
        employee1.setInfo("john", company, "SDET", "m","A123",40,
                55,120.000);

        // a=100; cause its not STATIC
        b=200;
        System.out.println("Static Block");
    }
     //excell sheet

//    public static void main(String[] args) {
//      company ="Capital One";
//      isEmployee=true;
//      employee1=new Employee();
//      employee1.setInfo("Ayah",company,"SDET","f","s356565",35,45,78);
//      b=200;
//        System.out.println(company);
//        System.out.println(employee1);
//        System.out.println(b);
//        System.out.println(isEmployee);
//    }
}
