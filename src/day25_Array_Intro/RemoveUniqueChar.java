package day25_Array_Intro;

public class RemoveUniqueChar {
    public static void main(String[] args) {

        String str = "abcdabd";
        String result = "";

        for (int j = 0; j <str.length() ; j++) {
            char ch= str.charAt(j);
            int count =0;
            for (int i = 0; i <str.length() ; i++) {
                char eachCharacter = str.charAt(i);
                    if (eachCharacter == ch){
                        count++;
                    }
                }
                if (count > 1){
                    result+=ch;
                }


            }
        System.out.println("result = " + result);
        }




    }
