// Parent class
class Vehicle {
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    void display() {
        System.out.println("Vehicle brand: " + brand);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int wheels;
    
    Car(String brand, int wheels) {
        super(brand);  // Call to parent constructor
        this.wheels = wheels;
    }
    
    // Overriding the parent method
    void display() {
        System.out.println("Car brand: " + brand + ", Wheels: " + wheels);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", 4);
        myCar.display();  // Calls overridden method in Car
    }
}
/* Output:
Car brand: Honda, Wheels: 4
*/