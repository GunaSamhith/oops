class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    
    BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

   
    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = 1001; 
        this.balance = 0.0;
    }

    
    BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 1000.0; // Default balance
    }

    
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
