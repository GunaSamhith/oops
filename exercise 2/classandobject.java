class Student {
    String name;
    int age;
    
    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        student1.displayDetails();
        
        Student student2 = new Student("Emma", 22);
        student2.displayDetails();
    }
}
