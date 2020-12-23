package day41_Encapsulation;

public class BankAccount {

    public final static String bankName = "Bank od America";

    public String firstNAme, lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstNAme, String lastName, int accountNumber){
        this.firstNAme = firstNAme;
        this.lastName=lastName;
        setAccountHolder(firstNAme, lastName);
        setAccountNumber(accountNumber);
    }



    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String firstNAme, String lastName) {
        this.firstNAme=firstNAme;
        this.lastName=lastName;
        this.accountHolder = firstNAme.toUpperCase()+lastName.toUpperCase();
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // depositing some money
    public void deposit(double amount){
        if (amount<0){
            System.out.println("Invalid number"+amount);
            return;
        }
        System.out.println("Depositing amount of money "+amount+" to "+accountNumber);
        setBalance(balance+amount);
    }

    /// withdrawing sime money
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing $ "+amount +" from "+accountNumber);
        setBalance(balance-amount);
    }


    //show available balance
    public void availableBalance(){
        System.out.println("Available balannce of "+getAccountNumber()+" is : "+getBalance());
    }




    /*

WarmUp tasks:
    create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            public methods:
                    deposit
                    withdraw
                    availableBalance

     */
}
