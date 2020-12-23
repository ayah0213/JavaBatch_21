package day34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyChar3 {
    public static void main(String[] args) {

        // finding frequncy of cgaracters
        String strFreq ="AAABBBBCDMMMNHJ";
        String result="";

        ArrayList<Character> list = new ArrayList<>();

        for (char each: strFreq.toCharArray())
            list.add(each);
        for (char each : list){
            int f = Collections.frequency(list, each);

            if (result.contains(""+each)){
                continue;
            }

            result+=each+""+ f;
        }
        System.out.println(result);

        System.out.println("=======================================");


        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(10);
        nums.add(110);
        nums.add(210);
        nums.add(310);
        nums.add(150);
        nums.add(510);
        nums.add(1110);

        int max=Collections.max(nums);
        int min=Collections.min(nums);

        System.out.println("min is : "+min+" and max "+ max);

    }



}
