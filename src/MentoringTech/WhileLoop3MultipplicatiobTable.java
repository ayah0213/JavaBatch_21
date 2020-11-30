package MentoringTech;

public class WhileLoop3MultipplicatiobTable {

    public static void main(String[] args) {

        int mutiplicationTable = 0;
        int j = 1;

        while (mutiplicationTable <=10) {
            while (j <= 10) {
                System.out.print(mutiplicationTable * j + " ");
                j++;
            }
            mutiplicationTable++;
            j=1;
            System.out.println();
        }
    }
}
