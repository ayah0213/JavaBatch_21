package day38_CustomClassContinue.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTEam {

    public static void main(String[] args) {


        Developers developer1 = new Developers();
        Developers developer2 = new Developers();
        Developers developer3 = new Developers();
        Developers developer4 = new Developers();

        developer1.setInfo("Bektemir", "K-01", "Full stack Developer", 65.250, 'M', "kokipo");
        developer2.setInfo("Nikola", "Y-821", "Software Developer", 75.25, 'M', "lolipo");
        developer3.setInfo("Meredith", "T-234", "Full stack Developer", 85.25, 'F', "ppop");
        developer4.setInfo("Ian", "L-02", "Developer", 54.254, 'M', "opium");


        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan","0005","Tester",545.03,'M',"jojo");
        tester2.setInfo("Dean","0006","Tester",85.265,'M',"momimo");
        tester3.setInfo("Jair","0007","Tester",653.25,'M',"gipok");


        Tester[] testers= {tester2, tester3};
        Developers[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.setInfo("Yalcin","BAktemir","Aylin");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        System.out.println(developers);

        System.out.println(scrum1);


        System.out.println("--------------------------------");
        for (Developers each : scrum1.developersTEam){
            System.out.println(each);
        }

        for (Tester each: scrum1.testersTEam){
            System.out.println(each);
        }

        System.out.println("=================================================");
       Tester tester4= new Tester();
       Tester tester5= new Tester();
       tester4.setInfo("Zainab","LJ454","Front desk",42.36,'F',"AamitySchool");
       tester5.setInfo("Muhsin","KLO546","Translator",48.520,'M',"LIbrarry");


       Developers developers5= new Developers();
       Developers developers6=new Developers();
       developers5.setInfo("Zhazira","OP85","Cleaning",66.025,'F',"Startzz");
       developers6.setInfo("Aybolke","AL58","POST",85.251,'F',"Post office");

       ScrumTeam scrum2 = new ScrumTeam();
       scrum2.addTester(tester4);
       scrum2.addTester(tester5);
       scrum2.addDeveloper(developers5);
       scrum2.addDeveloper(developers6);

       scrum2.setInfo("Svetlana","Daniel","Mayasa");

        System.out.println(scrum1);
        System.out.println(scrum2);

        System.out.println("============================================================");
        System.out.println("print the names and salary of every  single testers: ");
        ScrumTeam[] scrums = {scrum1, scrum2};
        // print the names and salary of every  single testers
        for (ScrumTeam eachScrum: scrums){ // nested loop
            for (Tester eachTesters : eachScrum.testersTEam)
            System.out.println(eachTesters.name+" $"+eachTesters.salary);
        }

        System.out.println(" print the names & salary of every single developer: ");
        // print the names & salary of every single developer
        for (ScrumTeam eachScrum : scrums){
            for (Developers eachDevelopers : eachScrum.developersTEam){
                System.out.println(eachDevelopers.name+" $"+eachDevelopers.salary);
            }
        }

        System.out.println("================================================================");
        // find out how many developers and testers we have in entite scrumteam

        int counDevlopers=0;
        int countTesters=0;

        for (ScrumTeam each :scrums){
            countTesters+= each.testersTEam.size();
            counDevlopers+=each.developersTEam.size();
        }
        System.out.println("Count of Testers: "+countTesters+", and count of Developers is: "+counDevlopers);

        System.out.println("==============================================================================");

        scrums[1].Sm="Aihaitih";
        scrums[1].Sm="Aysel";
        System.out.println(scrums[0]);
        System.out.println(scrums[1]);

        System.out.println("===============================================");
        ArrayList<ScrumTeam> scrumList= new ArrayList<>();

        scrumList.addAll(Arrays.asList(scrums));

        //TO PRINT OUT EACH TESTER AND DEVELOOPER NAME AND SALARY by using" for loop"
//        for (int i = 0; i <=scrumList.size() ; i++) {
//           ScrumTeam eachTeam = scrumList.get(i);
//
//            for (int j = 0; j < eachTeam.testersTEam.size()-1; j++) {
//               Tester eachTester= eachTeam.testersTEam.get(i); // to get each Tester
//                System.out.println(eachTester.name+":"+eachTester.salary);
//            }
//            for (int k = 0; k< eachTeam.developersTEam.size()-1; k++){
//                Developers eachDeveloper = eachTeam.developersTEam.get(k);
//                System.out.println(eachDeveloper.name+":"+eachDeveloper.salary);
//            }
//        }
//      TO PRINT OUT EACH TESTER AND DEVELOOPER NAME AND SALARY by using "for each loop"
        for (ScrumTeam eachScrum : scrumList){
            for (Tester eachTester: eachScrum.testersTEam){
                System.out.println("Each tester name : "+eachTester.name+", each testers salary "+eachTester.salary);
            }
            System.out.println("--------------------------------------------------------------------------------------------------");
            for (Developers eachDeveloper: eachScrum.developersTEam){
                System.out.println("Each developer name: "+eachDeveloper.name+" , each developer salary "+eachDeveloper.salary);
            }
        }


    }

}
