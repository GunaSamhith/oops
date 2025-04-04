class Account {
    private String accountNumber;
    private double balance;

        public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   
    public String getAccountNumber() {
        return accountNumber;
    }

        public double getBalance() {
        return balance;
    }

        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
    Account account = new Account("12345", 1000.00);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        
        account.deposit(500.00);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(300.00);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}