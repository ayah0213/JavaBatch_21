package MentoringTech;

public class ForLoop {
    public static void main(String[] args) {


//        System.out.println("Hello");
//        System.out.println("HEllo");
//
//        for (int i = 1; i <=1587; i++) {
//            System.out.print(i+" ");
//
//        }
//
//        for (int num = 0; num <= 35484 ; num++) {
//            if (num % 2 ==0){
//                System.out.print("even "+num+" ");
//            }else {
//                System.out.println("odd nums "+num);
//            }
//
//        }


        int counContainer=0; //+1=1

        for (int i=1; i<=257; i++ ){
            if (i%2 ==0){
                counContainer++; // count=count+1
            }
        }
        System.out.println(counContainer);
    }
}
