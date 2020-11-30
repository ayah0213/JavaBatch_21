package MentoringTech;

public class IfElse2 {

    public static void main(String[] args) {

        int num =147;
        boolean isEven=true;

        if (num % 2==0){
            for (int i = 0; i <=15 ; i++) {
                System.out.println("IS even");
            }
        }else if (num % 2!=0){
            for (int i = 1; i <=4 ; i++) {
                System.out.println(num+" "+"is odd num");
            }
        }
    }
}
