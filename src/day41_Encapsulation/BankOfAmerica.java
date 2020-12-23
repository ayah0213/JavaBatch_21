package day41_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Josh",
                "Naive", 13383215);

        System.out.println(obj1.getAccountHolder());
        System.out.println(obj1.getBalance());
        obj1.deposit(200);
        obj1.availableBalance();

        System.out.println("========================");
        obj1.deposit(100);
        obj1.availableBalance();
        System.out.println(BankAccount.bankName);
    }
}
