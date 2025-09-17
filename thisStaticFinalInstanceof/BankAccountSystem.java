package thisStaticFinalInstanceof;
// Sample Program 1: Bank Account System
// Demonstrates: static, this, final, instanceof

public class BankAccountSystem {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;

    public BankAccountSystem(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccountSystem) {
            System.out.println("Bank: " + bankName + ", Account Number: " + accountNumber + ", Holder: " + accountHolderName);
        }
    }

    public static void main(String[] args) {
        BankAccountSystem acc1 = new BankAccountSystem(101, "Alice");
        BankAccountSystem acc2 = new BankAccountSystem(102, "Bob");
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccountSystem.getTotalAccounts();
    }
}
