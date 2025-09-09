package accessModifiers;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: " + getBalance()); // private via getter
        System.out.println("Interest Rate: " + interestRate);
    }
}
