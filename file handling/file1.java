import java.io.*;
import java.util.*;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Grade Management System");
        System.out.println("1. Add Student Record");
        System.out.println("2. View All Records");
        System.out.println("3. Search Student Record");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch(choice) {
            case 1:
                addStudentRecord();
                break;
            case 2:
                viewAllRecords();
                break;
            case 3:
                searchStudentRecord();
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    private static void addStudentRecord() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("students.txt", true))) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Grade: ");
            String grade = scanner.nextLine();
            
            writer.println(id + "," + name + "," + grade);
            System.out.println("Record added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    private static void viewAllRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            System.out.println("\nID\tName\tGrade");
            System.out.println("---------------------");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    private static void searchStudentRecord() {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Student ID to search: ");
            String searchId = scanner.nextLine();
            
            String line;
            boolean found = false;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equalsIgnoreCase(searchId)) {
                    System.out.println("\nStudent Found:");
                    System.out.println("ID: " + parts[0]);
                    System.out.println("Name: " + parts[1]);
                    System.out.println("Grade: " + parts[2]);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Student with ID " + searchId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

