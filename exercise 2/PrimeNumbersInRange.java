import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        
        for (int i = lower; i <= upper; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
