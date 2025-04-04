import java.io.*;
import java.util.*;

public class InventoryManagement {
    private static final String INVENTORY_FILE = "inventory.dat";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch(choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    updateProductQuantity();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    
    private static void addProduct() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(INVENTORY_FILE, true))) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter Product ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            
            Product product = new Product(id, name, price, quantity);
            oos.writeObject(product);
            System.out.println("Product added successfully!");
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    private static void viewAllProducts() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(INVENTORY_FILE))) {
            
            System.out.println("\nID\tName\tPrice\tQuantity");
            System.out.println("--------------------------------");
            
            while (true) {
                try {
                    Product product = (Product) ois.readObject();
                    System.out.println(product.getId() + "\t" + 
                                      product.getName() + "\t" + 
                                      product.getPrice() + "\t" + 
                                      product.getQuantity());
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    private static void updateProductQuantity() {
        // This is a simplified version - in a real app, you'd need to rewrite the entire file
        // when updating records in a serialized file
        
        System.out.println("Note: Updating serialized files directly is complex.");
        System.out.println("In a real application, you would:");
        System.out.println("1. Read all objects into memory");
        System.out.println("2. Modify the desired object");
        System.out.println("3. Write all objects back to a new file");
        System.out.println("This example is simplified to demonstrate file handling basics.");
    }
}

class Product implements Serializable {
    private String id;
    private String name;
    private double price;
    private int quantity;
    
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}