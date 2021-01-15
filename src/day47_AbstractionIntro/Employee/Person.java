package day47_AbstractionIntro.Employee;

public abstract class Person {

    public String name;
    public int age;
    public char gender;

    public abstract void sleep();

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
