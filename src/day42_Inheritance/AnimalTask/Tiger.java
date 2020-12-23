package day42_Inheritance.AnimalTask;

public class Tiger extends Animal {

    public Tiger(String name, String color, String size, String breed,
                 char gender, int age) {
        setInfo(name, color, size, breed, gender, age);
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }

    public void roar() {
        System.out.println(name + " is roaring");
    }

    public String toString() {
        return "Toger{" +
                "breead='" + breead +
                ", color='" + color +
                ", name='" + name +
                ", size='" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
