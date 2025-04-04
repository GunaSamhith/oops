import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileHandling {
    public static void main(String[] args) {
        // Writing to a binary file
        try (FileOutputStream out = new FileOutputStream("binary.dat")) {
            byte[] data = {10, 20, 30, 40, 50};
            out.write(data);
            System.out.println("Data written to binary file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a binary file
        try (FileInputStream in = new FileInputStream("binary.dat")) {
            int byteRead;
            System.out.println("Reading from binary file:");
            while ((byteRead = in.read()) != -1) {
                System.out.print(byteRead + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}