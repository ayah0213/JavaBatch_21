package day42_Inheritance.AnimalTask;

public class WaterAnimal extends  Animal {

    public WaterAnimal(String name, String color, String size, String breed, char gender, int age) {
        setInfo(name, color, size, breed, gender, age);

    }

    public void swim(){
        System.out.println(name+" is swimming");
    }
    public void crawl(){
        System.out.println(name+" "+breead+" "+"can crawl on the earth");
    }


    public String toString() {
        return "WaterAnimal{" +
                "breead='" + breead +
                ", color='" + color +
                ", name='" + name +
                ", size='" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
