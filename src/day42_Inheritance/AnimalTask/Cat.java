package day42_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String color, String size, String breed,
               char gender, int age) {
        setInfo(name, color, size, breed, gender, age);
    }

    public void meow(){
        System.out.println(name+" meowing");
    }
    public String toString() {
        return "Cat{" +
                "breead='" + breead +
                ", color='" + color +
                ", name='" + name +
                ", size='" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}