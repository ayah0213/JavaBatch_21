package day18_StringMethods;

public class SubstringString {
    public static void main(String[] args) {

        String str="todays is Monday";
        str=str.substring(9,str.length());
        System.out.println(str);

        String emial="cybertek@gmail.com";
        String domain=emial.substring(9,13+1);
        System.out.println("Domain of your gmail is "+emial+":"+" "+domain);


      String word="I like movies and books";
      String words1=word.substring(7,13);
        System.out.println(words1);

        System.out.println("==================================");


      String name="aYjEreN";
      String fNAme=name.substring(0,1).toUpperCase();
      String result =name.substring(1,name.length()-1+1).toLowerCase();

        System.out.println(fNAme);
        System.out.println(result);
        name=fNAme+result;
        System.out.println(name);



}
}





