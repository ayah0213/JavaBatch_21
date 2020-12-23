package tasks.CustomClasses;

public class StudentsClassMEthods {
    /*
    1. Student:
         Attributes:
         name, age, gender, ID
         Actions:
         setInfo
         getInfo
         study
         sleep
         ...
*/
    public String studentName;
    public String studentsLastNAme;
    public int studentsAge;
    public char studentGender;
    public long studentID;
    public String studentStudy;
    public boolean isMarried;
    public int studentsHaskids;
    public String studentHArdwork;
    public String studentVolounteer;

    public void setInfoStudent(String sName, String sLAstName, int sAge, char sgender,long sID,
                               String sTudy, int sKids,
                               String sHrdworking, String sVolounteers){
        studentName=sName;
        studentsLastNAme=sLAstName;
        studentGender=sgender;
        studentID=sID;
        studentsAge=sAge;
        studentStudy=sTudy;
        studentsHaskids=sKids;
        studentHArdwork=sHrdworking;
        studentVolounteer=sVolounteers;

    }

    public void getinfo(){
        System.out.println("============");
        System.out.println("Student name & last name: "+studentName+","+studentsLastNAme);
        System.out.println("Student age & id number: "+studentsAge+","+studentID+","+studentGender);

    }

    public void personality(){
        System.out.println("====================");
        System.out.println("Student is studying:"+studentStudy);

        //System.out.println("Students is married: "+s);
        System.out.println("This tusdent is old has : "+studentsHaskids+" kids");
        System.out.println(studentName+","+studentsLastNAme+" is Student one of the "+studentHArdwork+" students");
    }

    public void hobbies(){
        System.out.println(studentName+","+studentsLastNAme+" she loves to "+studentVolounteer+"for charities");
    }


}

