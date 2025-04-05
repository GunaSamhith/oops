import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class BankManagementSystem {
    
    static class BankAccount {
        private String accountHolder;
        private String accountNumber;
        private String email;
        private double balance;
        private String accountCreationDate;
        
        public BankAccount(String accountHolder, String accountNumber, String email, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.email = email;
            this.balance = balance;
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            this.accountCreationDate = currentDateTime.format(formatter);
        }

        public void displayAccountDetails() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Email: " + email);
            System.out.println("Balance: $" + balance);
            System.out.println("Account Creation Date: " + accountCreationDate);
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
                System.out.println("New Balance: $" + balance);
            }
        }
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        String accountRegex = "^[0-9]{10}$"; // Account number must be 10 digits
        Pattern pattern = Pattern.compile(accountRegex);
        Matcher matcher = pattern.matcher(accountNumber);
        return matcher.matches();
    }

   
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void sendEmailNotification(String email) {
            try (Socket socket = new Socket("localhost", 25)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String response = in.readLine();
            System.out.println("Server response: " + response);

            out.println("EHLO localhost");
            response = in.readLine();
            System.out.println("Server response: " + response);

            out.println("MAIL FROM:<noreply@bank.com>");
            response = in.readLine();
            System.out.println("Server response: " + response);

            out.println("RCPT TO:<" + email + ">");
            response = in.readLine();
            System.out.println("Server response: " + response);

            out.println("DATA");
            response = in.readLine();
            System.out.println("Server response: " + response);

            out.println("Subject: Welcome to Our Bank");
            out.println("Hello, your account has been successfully created.");
            out.println(".");
            response = in.readLine();
            System.out.println("Server response: " + response);

            out.println("QUIT");
            response = in.readLine();
            System.out.println("Server response: " + response);

        } catch (IOException e) {
            System.out.println("An error occurred while sending the email: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account holder's name:");
        String accountHolder = scanner.nextLine();

        String accountNumber;
        while (true) {
            System.out.println("Enter a 10-digit account number:");
            accountNumber = scanner.nextLine();
            if (isValidAccountNumber(accountNumber)) {
                break;
            } else {
                System.out.println("Invalid account number! Please enter a 10-digit account number.");
            }
        }

        String email;
        while (true) {
            System.out.println("Enter email address:");
            email = scanner.nextLine();
            if (isValidEmail(email)) {
                break;
            } else {
                System.out.println("Invalid email address! Please enter a valid email.");
            }
        }

        System.out.println("Enter initial deposit amount:");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, email, balance);

        account.displayAccountDetails();

        
        sendEmailNotification(email);

        System.out.println("\nEnter deposit amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("\nEnter withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        scanner.close();
    }
}