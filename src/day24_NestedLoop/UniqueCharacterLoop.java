package day24_NestedLoop;

public class UniqueCharacterLoop {
    public static void main(String[] args) {

        /*

    3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCCD";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one, and if the frequency of the
                    character is equal to 1, it means it's unique
             In previous section we leaned how to find the frequency of one character.
              you will need to repeat the same steps

         */

        String str = "AABCCDGRFF";


        for (int index = 0; index <= str.length(); index++) {
            // purpose to iterate characte 1 at the time
            int frequency = 0;


            for (int inner = 0; inner < str.length(); inner++)
                if (str.charAt(index) == str.charAt(inner)) {
                    frequency++;
                }
            if (frequency == 1) {
                System.out.println(str.charAt(index));
            }


        }
    }
}




