package day38_CustomClassContinue.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, Sm;

    public ArrayList<Tester> testersTEam= new ArrayList<>();
    public  ArrayList<Developers> developersTEam=new ArrayList<>();

    public static boolean hasSprint=true;
    public static boolean hasMeetings=true;

    public void setInfo(String PO, String BA, String sm) {
        this.PO = PO;
        this.BA = BA;
        Sm = sm;
    }

    public void addTester(Tester tester){
        testersTEam.add(tester);
    }
    public  void addTester(Tester[] tester){
        testersTEam.addAll(Arrays.asList(tester));
    }

    public void removeTEster(String ID){
        testersTEam.removeIf(p-> p.ID.equalsIgnoreCase(ID));
    }

    public void addDeveloper(Developers developer){
        developersTEam.add(developer);
    }

    public void addDeveloper(Developers[] developers){
        developersTEam.addAll( Arrays.asList(developers)  );
    }

    public void removeDeveloper(String ID){
        developersTEam.removeIf(p-> p.ID.equalsIgnoreCase(ID));
    }


    public String toString() {
        return "PO: "+PO+", BA: "+BA+", SM: "+Sm+", Total Numbers of Testers: "+testersTEam.size()
                +", Total Number of Developers: "+developersTEam.size();
    }
}
