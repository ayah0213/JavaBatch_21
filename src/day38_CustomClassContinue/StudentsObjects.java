package day38_CustomClassContinue;

public class StudentsObjects {
    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents();
        student1.setInfo("Aynur",23,12,'F');

        CybertekStudents student2= new CybertekStudents();
        student2.setInfo("Mihail",28,14,'M');

        CybertekStudents students3 = new CybertekStudents();
        students3.setInfo("Ayah", 26,16,'F');

//        System.out.println(student1.schoolName);
//        System.out.println(student2.schoolName);

        System.out.println(CybertekStudents.schoolName); // preffered
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(students3);

        CybertekStudents.getSchoolInfo();
    }
}
