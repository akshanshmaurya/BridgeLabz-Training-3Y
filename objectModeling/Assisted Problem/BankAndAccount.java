import java.util.ArrayList;


class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;  

    public Account(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


class Customer {
    private String name;
    private ArrayList<Account> accounts; 

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    
    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println(" - Account " + acc.getAccountNumber() + " at " + acc.getBank().getName()
                               + " : " + acc.getBalance());
        }
    }
}


class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    
    public void openAccount(Customer customer, String accountNumber, double initialDeposit) {
        Account newAccount = new Account(accountNumber, initialDeposit, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " at " + name);
    }
}

public class BankAndAccount {
    public static void main(String[] args) {
        
        Bank sbi = new Bank("State Bank of India");

        
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        
        sbi.openAccount(c1, "A101", 5000);
        sbi.openAccount(c1, "A102", 10000);
        sbi.openAccount(c2, "B201", 7000);

        
        System.out.println();
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();

        
        System.out.println();
        c1.viewBalance();
    }
    
}
