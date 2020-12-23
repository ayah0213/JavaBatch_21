package day42_Inheritance.AnimalTask;

public class Zoo { // Zoo HAS a TIGEr
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Shirhan", "black", "large", "Bengali", 'M', 5);
        System.out.println(tiger);
        tiger.roar();
        tiger.hunt();


        Cat cat = new Cat("Anfisa", "pink", "medium", "Persian", 'F', 3);
        cat.meow();
        System.out.println(cat);


        Dog dog = new Dog("Garagoz", "GreyBlack", "xLArge", "Alabay", 'M', 3);
        dog.bark();
        System.out.println(dog);

        Birds bird = new Birds("Parrot", "Colorfull", "small", "Wild", 'f',5);
        bird.sing();
        bird.fly();
        System.out.println(bird);

        WaterAnimal waterAnima= new WaterAnimal("Turtle","Brownish","Large","OceanBlue",'F',13);
        waterAnima.swim();
        waterAnima.crawl();
        System.out.println(waterAnima);

    }

  }