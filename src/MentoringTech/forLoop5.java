package MentoringTech;

public class forLoop5 {
    public static void main(String[] args) {

        int countEvenContainer = 0;
        int countOddContainer = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                countEvenContainer = countEvenContainer + i;
            } else if (i % 2 != 0) {
                countOddContainer = countOddContainer + i;
            }
        }
        if (countEvenContainer > countOddContainer) {
            System.out.println("sum of even countcontainer is bigger than odd");
        }else if (countEvenContainer<countOddContainer){
            System.out.println(" sum of odd is bigger than even num");
        }

    }
}
