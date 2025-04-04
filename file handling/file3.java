import java.io.*;
import java.util.*;

public class LogFileAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Log File Analyzer");
        System.out.print("Enter log file path: ");
        String filePath = scanner.nextLine();
        
        analyzeLogFile(filePath);
    }
    
    private static void analyzeLogFile(String filePath) {
        Map<String, Integer> errorCounts = new HashMap<>();
        int totalLines = 0;
        int errorLines = 0;
        int warningLines = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                totalLines++;
                
                if (line.contains("ERROR")) {
                    errorLines++;
                    // Extract error type (simplified)
                    String errorType = extractErrorType(line);
                    errorCounts.put(errorType, errorCounts.getOrDefault(errorType, 0) + 1);
                } else if (line.contains("WARNING")) {
                    warningLines++;
                }
            }
            
            // Generate report
            System.out.println("\nLog File Analysis Report");
            System.out.println("========================");
            System.out.println("Total lines processed: " + totalLines);
            System.out.println("Error lines: " + errorLines);
            System.out.println("Warning lines: " + warningLines);
            
            System.out.println("\nError Types Breakdown:");
            for (Map.Entry<String, Integer> entry : errorCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
            }
            
            // Write report to file
            writeReportToFile(totalLines, errorLines, warningLines, errorCounts);
            
        } catch (IOException e) {
            System.out.println("Error analyzing log file: " + e.getMessage());
        }
    }
    
    private static String extractErrorType(String line) {
        // Simplified error type extraction
        if (line.contains("Connection")) return "Connection Error";
        if (line.contains("Timeout")) return "Timeout Error";
        if (line.contains("Database")) return "Database Error";
        return "General Error";
    }
    
    private static void writeReportToFile(int totalLines, int errorLines, 
                                         int warningLines, Map<String, Integer> errorCounts) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log_report.txt"))) {
            writer.println("Log File Analysis Report");
            writer.println("========================");
            writer.println("Generated on: " + new Date());
            writer.println();
            writer.println("Total lines processed: " + totalLines);
            writer.println("Error lines: " + errorLines);
            writer.println("Warning lines: " + warningLines);
            
            writer.println("\nError Types Breakdown:");
            for (Map.Entry<String, Integer> entry : errorCounts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
            }
            
            System.out.println("\nReport written to log_report.txt");
        } catch (IOException e) {
            System.out.println("Error writing report file: " + e.getMessage());
        }
    }
}
