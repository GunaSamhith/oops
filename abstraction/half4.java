abstract class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    
    @Override
    public double calculateInterest() {
        return balance * 0.04;  // 4% interest for savings account
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

   
    @Override
    public double calculateInterest() {
        return balance * 0.01;  // 1% interest for checking account
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Alice", 1000);
        BankAccount checking = new CheckingAccount("Bob", 1500);

        System.out.println(savings.accountHolder + "'s Interest: $" + savings.calculateInterest());
        System.out.println(checking.accountHolder + "'s Interest: $" + checking.calculateInterest());
    }
}