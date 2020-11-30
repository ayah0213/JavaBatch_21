package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

       int n1 = list.indexOf(10);
        int n2 = list.indexOf(10);
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(list.contains(60));
        System.out.println(! list.contains(60));

        String str = "aabbc";
        String result="";
        System.out.println("=========================================");

        ArrayList<Character> characters= new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('D');
        characters.add('E');
        characters.add('A');
        System.out.println(characters);

        ArrayList<Character> nonDup =new ArrayList<>();

        for(char each : characters){
          if (nonDup.contains(each)){
              continue;
          }
          nonDup.add(each);
        }
        System.out.println(nonDup);


        /*  with using for loop
          for(int i = 0; i <= characters.size()-1; i++ ){
            if(!nonDup.contains(characters.get(i))){
                nonDup.add(characters.get(i));
            }
        }
         */


          // equality method BOOLEan result
        System.out.println("===========================================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list1.equals(list2));

        list.clear();
        list2.clear();
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());
    }



}
