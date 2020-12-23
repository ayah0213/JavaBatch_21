package day38_CustomClassContinue;

import java.util.ArrayList;

/*
 setInfo(): sets the names of: PO, BA, SM
              addTester(Tester tester): adds the given tester to the testers arraylist
             addTesters(Tester[] testers): adds the given testers to the testers arraylist
           addDeveloper(Developer developer): adds the given developer to the developers arraylist
             addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
             removeTester(long employeeID): removes the given tester from the testers arraylist
             removeDeveloper(long employeeID): removes the developer from the developers arraylist
            toString(): prints number of tester,& developers,  PO name, SM name, BA name

 */
public class DevelopersObject {
    public static void main(String[] args) {

                   Developers [] scrumTeam = {new Developers(),new Developers(),new Developers(),new Developers(),new Developers()};
                   scrumTeam[0].setDevInfo("Ayjeren N.","BA","j2458745h467962",false,75.200);
                   scrumTeam[1].setDevInfo("Angelina O","PO","jh4679854862",true,95.200);
                   scrumTeam[0].setDevInfo("Diana S.","SM","jh46796542",true,85.300);

                    System.out.println(Developers.getICompanyInfo("StrinCybertek"));
                    System.out.println(scrumTeam[0].getInfo());
                    System.out.println(scrumTeam[1].getInfo());
                    System.out.println(scrumTeam[2].getInfo());
                    /*
                     setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
                            toString(): prints number of tester,& developers,  PO name, SM name, BA name
                     */
        System.out.println("-----------------------------------------------------------");
        ArrayList<Developers> devs = new ArrayList<>();







    }
}
