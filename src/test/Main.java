package test;

public class Main {
    public static void main(String[] args) {
//
//        // write a programm which types from 1 - 100 only even ones
//
//
////        for (int i = 1; i <=100 ; i++) {
////          if (i%2==0){
////              System.out.println("Even num "+i);
////          }
////        }
//        //  0 1 2 3 4 5 6 7 8
//      //  int[] arr = {7, 2, 3, 5, 6, 9, 8, 10, 4};
////        System.out.println(arr[0]);
////        System.out.println(arr[1]);
////        System.out.println(arr[2]);
//
////        for (int i = 1; i < 100; i++) {
////            if (i % 2 == 0) {
////                System.out.println(i+" Even number");
////            } else {
////                System.out.println(i+" Odd number");
////
////            }
//
//
//        // task 1 rpint out only even nums
//        for (int i = 1; i < 100; i++) {
//            if (i%2==0){
//                System.out.print("Even numbers "+i+" ");
//            }
//        }
//        System.out.println("-------------------------------------------");
//        // print out only odd Nums
//
//        for (int i = 1; i <100 ; i++) {
//            if (i%2!=0){
//                System.out.print("Odd numbers "+i+" ");
//            }
//        }
//

//        System.out.println("--------------------------------------------");
//        // count how many Even nums in 100 number
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {// check if it even?
//                sum = sum + 1;
//            }
//        }
//        System.out.println("Total of Even num :" + sum);
//
//        System.out.println("-----------------------------------------");
//        // count how many Odd nums in 100 number
//
//        int oddCount = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                oddCount = oddCount + 1;
//            }
//        }
//        System.out.println("TOtal of odd numbers: " + oddCount);
//
//        System.out.println("---------------------------------------------");
//
//
//        // print out thank you for lesson if u liked the lesson ,  else print out the lesson wasnt interesting
//        boolean likedLesson = true;
//        if (likedLesson == true) {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("Thank you for lesson");
//            }
//        } else {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("The lesson wasnot interesting");
//            }
//        }
//
//        System.out.println("-------------------------------------------");
//
//
//        // print out Im "Yay Imeligible adult" 60 times if bolleanAdult is true, else Print out 20 times "Sorry not eligible"
//        boolean isAdult = false;
//        if (isAdult == true) {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Yay you re eligible Adult");
//            }
//
//        } else {
//            if (isAdult == false) {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("sorry you re not eligible Adult");
//                }
//            }
//
//        }

        System.out.println("------------------------------------------------------");
        // check if how many numbers more devided by 3 or by 5?
        int num3 = 0;
        int num5 = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                num3 = num3 + 1;
                System.out.println("Numbers of number which devided by 5 is: " + num5);

            } else if (i % 5 == 0) {
                num5 = num5 + 1;
                System.out.println("Number of number which devided by 3 is: " + num3);

            } else {
                System.out.println("Sorry wrong number");
            }

        }
    }

}


