package day39_StaticBlock_CunstructorIntro;

public class CybertekStudent {

    public String name, gender;
    public int age;

    public static String schoolNAme, dreamJOb;
    public static boolean hasReplIt, hasFlipgrid;

    static {
        schoolNAme="CYbertek School";
        dreamJOb="SDET";
        hasReplIt=true;
        hasFlipgrid=true;
    }

    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age + "School name "+schoolNAme+
                '}';
    }
}
