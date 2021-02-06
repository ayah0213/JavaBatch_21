package day48_AbtsractionPractice.AnimalTask;

public class ZooPark {
    public static void main(String[] args) {

        Dog dog = new Dog("Charlie","Alabay","Xlarge",'F',9);
        dog.drink();
        dog.eat();
        dog.livesAthome();
        dog.sleep();
        System.out.println(dog);
        System.out.println("------------------------------");

        Cat cat = new Cat("Shirin","Persian","small",'F',2);
        cat.drink();
        cat.eat();
        cat.livesAthome();
        cat.sleep();
        System.out.println(cat);
        System.out.println("-----------------------------");


        Parrots parrot = new Parrots("Awstralopitechka","Australian","medium",'f',7);
        parrot.drink();
        parrot.eat();
        parrot.fly();
        parrot.sleep();
        parrot.livesAthome();
        System.out.println(parrot);
        System.out.println("------------------------------------");

        Tiger tiger = new Tiger("Shirhan","Asian","XXXXL",'F',19);
        tiger.drink();
        tiger.eat();
        tiger.hunt();
        tiger.sleep();
        System.out.println(tiger);
        System.out.println("-----------------------------------------");

        Lion lion = new Lion("Garagoz","SouthAfrican","Xl",'f',4);
        lion.drink();
        lion.eat();
        lion.hunt();
        lion.sleep();
        System.out.println(lion);
        System.out.println("--------------------------------------------");

        Eagle eag = new Eagle("Ucurym","TurkmenGaragum","Small",'M',1);
        eag.drink();
        eag.eat();
        eag.fly();
        eag.hunt();
        eag.sleep();
        System.out.println(eag);
        System.out.println(eag);
        System.out.println("-----------------------------------------------");


        Shark shark = new Shark("JAkcson","American","XXXXLLL",'F',28);
        shark.drink();
        shark.eat();
        shark.hunt();
        shark.sleep();
        shark.swim();
        System.out.println(shark);
        System.out.println("-------------------------------------------------");

        Buterfly butfly = new Buterfly("Oleo","Jamaican","Small",'m',1);
        butfly.drink();
        butfly.eat();
        butfly.fly();
        butfly.sleep();
        System.out.println(butfly);
        System.out.println("------------------------------------------------");



        Dolphin dolly = new Dolphin("Dolly","Atlantic","MEdium",'F',8);
        dolly.drink();
        dolly.eat();
        dolly.sleep();
        dolly.swim();
        System.out.println(dolly);
        System.out.println("---------------------------------------------");

    }
}
