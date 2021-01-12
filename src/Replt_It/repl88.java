package Replt_It;

import java.util.Scanner;

public class repl88 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        int wordCharCount = word.length();
        int tcharCount = 3;

        for (int i = 0; i <= wordCharCount - tcharCount; i++) {
            String targetWord = word.substring(i, i + tcharCount);

            if (targetWord.equals("cat")){
                countOfCats++;
            } else if (targetWord.equals("dog")) {
                countOfDogs++;
            }
        }
        System.out.println(countOfCats==countOfDogs);
    }
}











        /*
        Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
         */
