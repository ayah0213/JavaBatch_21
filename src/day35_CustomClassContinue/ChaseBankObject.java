package day35_CustomClassContinue;

public class ChaseBankObject {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.setInfo("Ayah","236585478535");
        account1.getInfo();
        account1.deposit(100);
        account1.withdraw(80);
        account1.withdraw(20);
        account1.deposit(174);
        account1.withdraw(43);
        account1.showBalance();

        BankAccount account2=new BankAccount();
        account2.setInfo("Zainab","235458871213");
        account2.deposit(859);
        account2.withdraw(523);
        account2.getInfo();
        account2.showBalance();


    }


}
