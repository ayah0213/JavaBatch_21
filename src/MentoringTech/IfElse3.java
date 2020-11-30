package MentoringTech;

public class IfElse3 {
    public static void main(String[] args) {

        int count3=0;
        int count5=0;

        for (int i = 0; i <101; i++) {

            if (i % 3==0){
                count3++;

            }if (i % 5==0){
                count5++;

            }
        }

        System.out.println(count5);
          System.out.println(count3);

          if (count3 > count5){
              System.out.println("3 more than 5");
          }if (count5>count3){
            System.out.println("5 more than 3");
        }
    }
}
