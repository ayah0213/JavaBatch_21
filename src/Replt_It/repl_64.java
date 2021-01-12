package Replt_It;

import java.util.Scanner;

public class repl_64 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word= scan.next();
        int charCount=word.length();

        if (charCount==1){
            System.out.println(word+word+word);
        }else if (charCount==2){
            System.out.println(word+word);
        }else if (charCount>=3){
            int middleIndex= charCount/2;
            if (charCount%2==1 ){
                System.out.println(word.charAt(middleIndex));
            }else {
                System.out.println(word.substring(middleIndex-1, middleIndex+1));
            }
        }


        /*
        You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
         */
    }
}
