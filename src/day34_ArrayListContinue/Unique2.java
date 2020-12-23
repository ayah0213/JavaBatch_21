package day34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique2 {

    public static void main(String[] args) {


        // finding unique integer nums with INteger Arr
        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,6,5,1,2,3,9,10,11));

        number.removeIf(p -> Collections.frequency(number, p) > 1);
        System.out.println(number);


        System.out.println("==========================================================");


        // finding unique characters with String ArraysList
        String str = "aabbcddefgg";
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList(str.split(" ")));
        strList.removeIf(p -> Collections.frequency(strList, p) > 1);
        System.out.println(strList);

        System.out.println("=============================================================");



        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', '1', 'b', '2', 'c', 'd', '$', '#', '@', '?', '*'));

        chars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);



    }
}
