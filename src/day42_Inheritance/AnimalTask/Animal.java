package day42_Inheritance.AnimalTask;

public class Animal {

    public String breead, color, name, size;
    public char gender;
    public int age;

    public void setInfo(String name, String breead, String color,
                        String size, char gender, int age) {
        this.breead = breead;
        this.color = color;
        this.name = name;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);

    }

    public void drink(String drinks) {
        System.out.println(name + " is drinking " + drinks);
    }

    public void sleep() {
        System.out.println(name + " i sleeping");
    }

    public String toString() {
        return "Animal{" +
                "breead='" + breead +
                ", color='" + color +
                ", name='" + name +
                ", size='" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


    }



