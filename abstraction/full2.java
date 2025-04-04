interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

        public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

        public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using credit card: " + cardNumber);
    }
}

class PayPalPayment implements Payment {
    private String paypalEmail;

      public PayPalPayment(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal email: " + paypalEmail);
    }
}


public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment("1234-5678-9876-5432");
        Payment paypal = new PayPalPayment("user@example.com");

        creditCard.processPayment(150.75);
        paypal.processPayment(75.50);
    }
}