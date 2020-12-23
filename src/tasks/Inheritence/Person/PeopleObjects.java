package tasks.Inheritence.Person;

public class PeopleObjects {
    public static void main(String[] args) {

        UnemployedPerson uneployedOne = new UnemployedPerson("Amir Khan",48,'M',"AK123","Uneployed",0.00);
        uneployedOne.sleeps(14);
        uneployedOne.eat("Fast-Food");
        System.out.println(uneployedOne);
        System.out.println("-----------------------------------------------------------------------------------");

        Employee employed = new Employee("Shakrukh Khan",66,'M',"Sk456","BEst Actor",250.00);
        employed.sleeps(4);
        employed.eat("Hindu Food");
        employed.emplWorks();
        System.out.println(employed);
        System.out.println("------------------------------------------------------------------------------------");

        Tester tester = new Tester("AyahJon NurJan",25,'M',"AN789","SDET",48.00);
        tester.sleeps(6);
        tester.eat("Palov");
        tester.testerWorks();
        tester.testing();
        System.out.println(tester);
        System.out.println(tester);
        System.out.println("-------------------------------------------------------------------------------------");

        Developer developer = new Developer("Altay abi",35,'M',"AB123","Best Developer",85.00);
        developer.sleeps(5);
        developer.eat("BeshBarmak");
        developer.devCode();
        developer.devWorks();
        System.out.println(developer);
    }


}
