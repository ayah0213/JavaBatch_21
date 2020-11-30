package MentoringTech;

public class IfElseSTatement {
    public static void main(String[] args) {

//        String firstName="Mary";
//        String lastNAme="Smith";
//
//        if (!firstName.contains("J")){
//            System.out.println("Welcome you name is "+firstName); // false print
//        }else {
//            System.out.println(firstName+" "+lastNAme+" "+"we can find ur name"); // true print his
//        }
//
//
//        int num=147;
//
//        if (num%2 == 0){
//            System.out.println("Even number "+num);
//        }else { // last statement decision
//            System.out.println("its odd number "+num);
//        }
//


        int num2 = 15;

        if (num2%3 ==0 && num2%5==0){
            System.out.println("Selam and Privet");
        }else if (num2%5==0){
            System.out.println("Privet");
        }else if (num2% 3==0){
            System.out.println("Selam");
        }

    }
}
