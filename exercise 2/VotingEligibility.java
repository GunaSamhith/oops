import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user to input the age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Checking if the person is eligible to vote (age 18 or above)
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        scanner.close();
    }
}
