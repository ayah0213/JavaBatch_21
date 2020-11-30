package MentoringTech;

public class PrimeNumberForLoop {
    public static void main(String[] args) {

        int primeNum=19;
        boolean isPrimerNum=true;

       for (int i=2; i<primeNum; i++) {
           if (primeNum % i == 0) {
               isPrimerNum = false;
           }
       }
       if (isPrimerNum){
           System.out.println(primeNum+" is prime num");
       }else {
           System.out.println(primeNum+"is not prime num");
       }
    }

    }
