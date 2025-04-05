import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class CombinedExample {
    public static void main(String[] args) {
        
        ArrayList<BigDecimal> numbers = new ArrayList<>();
        
        
        File file = new File("numbers.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                                numbers.add(new BigDecimal(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

          System.out.println("Numbers from the file: ");
        for (BigDecimal num : numbers) {
            System.out.println(num);
        }

            if (!numbers.isEmpty()) {
            BigDecimal sum = BigDecimal.ZERO;
            BigDecimal product = BigDecimal.ONE;
            for (BigDecimal num : numbers) {
                sum = sum.add(num);
                product = product.multiply(num);
            }

            // Print the results of the arithmetic operations
            System.out.println("\nSum of numbers: " + sum);
            System.out.println("Product of numbers: " + product);
        }
    }
}