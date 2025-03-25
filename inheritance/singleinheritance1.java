// Parent class
class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    Dog(String name) {
        super(name);  // Call to parent class constructor
    }
    
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method from Dog class
    }
}
/* Output:
Buddy is eating.
Buddy is barking.
*/