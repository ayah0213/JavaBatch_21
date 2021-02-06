package day29_CustomMethods;

public class ReverseString {
 public static void main(String[] args) {

reverseString("ayjeren");
     System.out.println("=====================================");

     String [] name= {"Sayyara","Ahmet","MUhammad","Ayah"};
     for (String each : name){
         reverseString(each);
     }
    }


    public static void reverseString(String word) {
        String result = " ";
        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }
            System.out.println(result);
        }
    }
