package day48_AbtsractionPractice.AnimalTask;

public abstract class Animals {

    public String name, breed, size;
    public char gender;
    public int age;

// set Constructor to set Instance variables
    public Animals(String name, String breed, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public abstract void sleep();
    public abstract void eat();
    public abstract void drink();




    // set toString to print out all data
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


