package OwnWork.Constructor;

public class Cat {

/*

    Cat:
        variables:
                breed, size, gender, color, numberOfLegs, numberOfEyes, numberOfWings
        add constructor to initialize all fields
        methods:
            toString()

 */

    public String breed, color;
    public char gender;
    public int numOfLEgs, numofEyes, numOfWings;


    public Cat(String breed, String color){
        this.breed=breed;
        this.color=color;
    }

    public Cat(String breed, String color, char gender){
        this(breed,color);
        this.gender=gender;
    }

    public Cat(String breed, String color, char gender, int numOfWings, int numofEyes, int numOfLEgs){
        this(breed, color, gender);
        this.numofEyes=numofEyes;
        this.numOfLEgs=numOfLEgs;
        this.numOfWings=numOfWings;
    }


    public String toString() {
        return "Cat{" +
                "breed='" + breed +
                ", color='" + color +
                ", gender=" + gender +
                ", numOfLEgs=" + numOfLEgs +
                ", numofEyes=" + numofEyes +
                ", numOfWings=" + numOfWings +
                '}';
    }
}

class CatObjects{
    public static void main(String[] args) {

        Cat cat1= new Cat("Scottish","White");

        Cat cat2= new Cat("TurkmenMilashka","DarkBlack",'F');

        Cat cat3= new Cat("RussianCold","Grey",'M',0,2,2);
        System.out.println(cat1);
        System.out.println(cat2);
        if (cat1==cat2){
            System.out.println("same family cat");
        }else {
            System.out.println("Wrong info, different families");
        }
        System.out.println(cat3);
    }
}
