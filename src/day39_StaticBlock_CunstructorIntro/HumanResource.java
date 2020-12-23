package day39_StaticBlock_CunstructorIntro;

import day37_InstanceClass.Employee;

public class HumanResource {


    public  static Employee empl1, empl2,empl3,empl4,empl5;



    static {

        // we have to create an objet=cts of static values
        empl1= new Employee();
        empl2=new Employee();
        empl3=new Employee();
        empl4=new Employee();
        empl5=new Employee();

        empl1.setInfo("Ayah", empl1.company, "Developer","F","s5252",42,70.00,85.50);
        empl2.setInfo("Jahan", empl2.company, "SDET","F","sd2525",38,45,75.00);
        empl3.setInfo("Misha", empl3.company, "Designer","F","hj8585",32,38.50,62.500);
        empl4.setInfo("Zack", empl4.company, "PO","M","kj4554",40,45,85);
        empl5.setInfo("Sara", empl4.company, "BA","F","lk6565",40,48,73.250);
    }

}
