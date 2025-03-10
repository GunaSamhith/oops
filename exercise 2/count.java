import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter a character to count: ");
        char character = scanner.next().charAt(0);
        
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        
        System.out.println("The character '" + character + "' appears " + count + " times.");
    }
}
