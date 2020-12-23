package day39_StaticBlock_CunstructorIntro;

import static library.Data.data1;
import static library.Data.data2;
import static library.Data.*;

import static library.ArraysUtility.*;

//import library.Data;// imports everything

public class Test {
    public static void main(String[] args) {

        System.out.println(StaticBlockIntro.company);
        System.out.println(StaticBlockIntro.employee1);
        System.out.println(StaticBlockIntro.b);
        System.out.println(StaticBlockIntro.isEmployee);
        StaticBlockIntro.company="BAnk of America";
        System.out.println(StaticBlockIntro.company);


        System.out.println("==================================");

        System.out.println(data1);
        System.out.println(data2);
        method1();
        method2();


        int [] arr={1,2,3,4,5,6};
        int max=max(arr);
        int min = min(arr);
        System.out.println(max+","+min);
    }
}
