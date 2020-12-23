package OwnWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyString {

    public static void main(String[] args) {


        String str = "AAABBCCDEFG";
        String newString="";
//        String newSTring = "";
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(""));
//        list.addAll(Arrays.asList(str.split("")));
//        for (String each : list) {
//            int freq = Collections.frequency(list, each);
//            if (!newSTring.contains(each)) newSTring += each + freq;
//
//        }
//        System.out.println(newSTring);

        ArrayList<Character> list = new ArrayList<>();
        for (char each: str.toCharArray()){
            list.add(each);
        }
       for (char each: list){
          int count= Collections.frequency(list, each);
           if (newString.contains(each+""))
               continue;
           newString+=each+""+count;

       }
        System.out.println(newString);

    }}
