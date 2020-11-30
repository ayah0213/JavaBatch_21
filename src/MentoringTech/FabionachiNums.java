package MentoringTech;

public class FabionachiNums {

    public static void main(String[] args) {

        int fabNum=1;
        int fabnUm2=1;

        System.out.println(fabNum+" "+fabnUm2+" ");

        for (int i = 3; i <=15 ; i++) {
            int fabNum3=fabNum+fabnUm2;
            System.out.print(fabNum3+" ");

            fabNum=fabnUm2;
            fabnUm2=fabNum3;
        }
    }
}
