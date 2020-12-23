package day41_Encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person p1 = new Person("Jimmy",19,'M');

        System.out.println(p1.getName());

        p1.setName("Joshua");
        p1.setGender('M');
        p1.setAge(23);
        System.out.println(p1.getName());
    }
}
