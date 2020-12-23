package OwnWork.Constructor;

public class Dog {

    /*
      Dog:
        variables:
                breed, size, gender, color, numberOfLegs, numberOfEyes, numberOfWings
        add constructor to initialize all fields
        methods:
            toString()
     */

    public String breed, color, size;
    public int ageLive, dogEyes, dogEars;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;

    }

    public Dog(String breed, String color, String size) {
        this(breed, color);
        this.size = size;
    }

    public Dog(String breed, String color, String size, int ageAlive, int dogEyes, int dogEars) {
        this(breed, color, size);
        this.ageLive = ageAlive;
        this.dogEyes = dogEyes;
        this.dogEars = dogEars;
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed  +
                ", color='" + color  +
                ", size='" + size +
                ", ageLive=" + ageLive +
                ", dogEyes=" + dogEyes +
                ", dogEars=" + dogEars +
                '}';
    }
}


  class DogObjects {

        public static void main(String[] args) {

            Dog dog1 = new Dog("Chihuahuha","Pink");

            Dog dog2 = new Dog("Owcharka","Black","Large");

            Dog dog3 = new Dog("Alabay","Grey","XLArge",9,2,3);
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);

        }


    }
