// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

// Derived class from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test multi-level inheritance
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Calling methods from all three levels
        myDog.eat();  // From Animal class
        myDog.walk(); // From Mammal class
        myDog.bark(); // From Dog class
    }
}