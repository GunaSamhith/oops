// Base Class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// Interface 1
interface Employee {
    void work();
}

// Interface 2
interface Student {
    void study();
}

// Class extending Person and implementing Employee & Student
class Intern extends Person implements Employee, Student {
    public void work() {
        System.out.println("Intern is working.");
    }

    public void study() {
        System.out.println("Intern is studying.");
    }
}

// Main Class
public class HybridInheritanceExample3 {
    public static void main(String[] args) {
        Intern intern = new Intern();
        intern.speak();
        intern.work();
        intern.study();
    }
}