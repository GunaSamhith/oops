import java.io.*;
import java.util.*;

public class ConfigManager {
    private static final String CONFIG_FILE = "config.properties";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Configuration Manager");
        System.out.println("1. View Configuration");
        System.out.println("2. Update Configuration");
        System.out.println("3. Add New Setting");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch(choice) {
            case 1:
                viewConfiguration();
                break;
            case 2:
                updateConfiguration();
                break;
            case 3:
                addNewSetting();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    private static void viewConfiguration() {
        Properties props = new Properties();
        
        try (InputStream input = new FileInputStream(CONFIG_FILE)) {
            props.load(input);
            
            System.out.println("\nCurrent Configuration:");
            System.out.println("----------------------");
            for (String key : props.stringPropertyNames()) {
                System.out.println(key + " = " + props.getProperty(key));
            }
        } catch (IOException e) {
            System.out.println("Error reading configuration: " + e.getMessage());
        }
    }
    
    private static void updateConfiguration() {
        Properties props = new Properties();
        Scanner scanner = new Scanner(System.in);
        
        try (InputStream input = new FileInputStream(CONFIG_FILE)) {
            props.load(input);
            
            System.out.println("\nCurrent Configuration:");
            for (String key : props.stringPropertyNames()) {
                System.out.println(key + " = " + props.getProperty(key));
            }
            
            System.out.print("\nEnter setting key to update: ");
            String key = scanner.nextLine();
            
            if (props.containsKey(key)) {
                System.out.print("Enter new value for " + key + ": ");
                String value = scanner.nextLine();
                props.setProperty(key, value);
                
                // Save the updated properties
                try (OutputStream output = new FileOutputStream(CONFIG_FILE)) {
                    props.store(output, "Updated configuration");
                    System.out.println("Configuration updated successfully!");
                }
            } else {
                System.out.println("Key not found in configuration.");
            }
            
        } catch (IOException e) {

            System.out.println("Error updating configuration: " + e.getMessage());
        }
    }
    
    private static void addNewSetting() {
        Properties props = new Properties();
        Scanner scanner = new Scanner(System.in);
        
        try (InputStream input = new FileInputStream(CONFIG_FILE)) {
            props.load(input);
            
            System.out.print("Enter new setting key: ");
            String key = scanner.nextLine();
            
            if (!props.containsKey(key)) {
                System.out.print("Enter value for " + key + ": ");
                String value = scanner.nextLine();
                props.setProperty(key, value);
                
                // Save the updated properties
                try (OutputStream output = new FileOutputStream(CONFIG_FILE)) {
                    props.store(output, "Added new setting");
                    System.out.println("New setting added successfully!");
                }
            } else {
                System.out.println("Key already exists. Use update option instead.");
            }
            
        } catch (IOException e) {
            System.out.println("Error adding new setting: " + e.getMessage());
        }
    }
}
