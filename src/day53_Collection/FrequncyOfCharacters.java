package day53_Collection;

import java.util.*;

public class FrequncyOfCharacters {

    public static void main(String[] args) {
        String str="aabbcc";
        Map<String, Integer> result= new LinkedHashMap<>();
        for (String s : str.split("")){// s: aabbcc
            int f= Collections.frequency(Arrays.asList(str.split("")),s) ; // f: 2 2 2 2 2 2
            result.put(s,f);

        }

        System.out.println(result);
    }
}
