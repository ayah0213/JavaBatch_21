package tasks.CustomClasses;

import tasks.CustomClasses.StudentsClassMEthods;

public class StudentsObjects {

    public static void main(String[] args) {

        StudentsClassMEthods student = new StudentsClassMEthods();
        student.setInfoStudent("Aylin","Yusufi",48,'F',345936, "SDET",
                3, "Very hard working","volounteers");

        student.getinfo();

        student.personality();

         student.hobbies();
    }
}
