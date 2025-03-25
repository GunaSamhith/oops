class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Default constructor
    BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Constructor with account holder's name
    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = 1001; // Default account number
        this.balance = 0.0;
    }

    // Constructor with name and account number
    BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 1000.0; // Default balance
    }

    // Constructor with all parameters
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 =