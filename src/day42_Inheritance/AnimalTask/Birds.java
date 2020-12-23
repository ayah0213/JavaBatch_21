package day42_Inheritance.AnimalTask;

public class Birds extends Animal {

    public Birds(String name, String color, String size,String breed,
                 char gender, int age) {
        setInfo(name, color, size, breed, gender, age);
    }
    public void fly(){
        System.out.println(name+" is able to fly");
    }

    public void sing(){
        System.out.println(name+" is singing");
    }

    public String toString() {
        return "Birds{" +
                "breead='" + breead +
                ", color='" + color +
                ", name='" + name +
                ", size='" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
