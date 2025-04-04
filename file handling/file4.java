import java.io.*;

public class BufferedFileHandling {
    public static void main(String[] args) {
        // Writing using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
            writer.write("This is written using BufferedWriter.");
            writer.newLine();
            writer.write("Another line with buffered writing.");
            System.out.println("Data written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"))) {
            String line;
            System.out.println("Reading using BufferedReader:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}