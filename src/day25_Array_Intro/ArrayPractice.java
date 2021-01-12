package day25_Array_Intro;

public class ArrayPractice {

    public static void main(String[] args) {

        String[] students = new String[5];
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);

        students[0]="Agalar";
        students[1]="Ayah";
        students[2]="Zhazira";
        students[3]="Muhtar";
        students[4]="Aylara";
//        System.out.println(students[1]);
//        System.out.println(students[0]);
//        System.out.println(students[4]);

        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);

        }



    }
}
