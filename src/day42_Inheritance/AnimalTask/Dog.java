package day42_Inheritance.AnimalTask;

 public class Dog extends Animal {

     public Dog(String name, String color, String size,String breed,
                           char gender, int age) {
         setInfo(name, color, size, breed, gender, age);
     }

     public void bark(){
         System.out.println(name+" is barking");
     }

      //to be able to print out in zoo class as Dog
     public String toString() {
         return "Dog{" +
                 "breead='" + breead +
                 ", color='" + color +
                 ", name='" + name +
                 ", size='" + size +
                 ", gender=" + gender +
                 ", age=" + age +
                 '}';
     }
 }
//
//class C{
//    public static void main(String[] args) {
//        new Dog().eat("Food");
//        new Animal().eat("Food");
//
//    }

