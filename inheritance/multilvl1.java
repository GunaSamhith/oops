// Base class
class Person {
    void display() {
        System.out.println("I am a person");
    }
}

// Derived class
class Employee extends Person {
    void display() {
        super.display(); // Calls the method from Person class
        System.out.println("I am an employee");
    }
}

// Further derived class
class Manager extends Employee {
    void display() {
        super.display(); // Calls the method from Employee class
        System.out.println("I am a manager");
    }
}

// Main class
public class SuperKeywordExample {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.display();
    }
}