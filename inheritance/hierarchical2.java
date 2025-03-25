// Parent class
class Vehicle {
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    void display() {
        System.out.println("Brand: " + brand);
    }
}

// Child class 1 inheriting from Vehicle
class Car extends Vehicle {
    int wheels;
    
    Car(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }
    
    void showDetails() {
        display();  // Inherited method
        System.out.println("Wheels: " + wheels);
    }
}

// Child class 2 inheriting from Vehicle
class Bike extends Vehicle {
    boolean hasHelmet;
    
    Bike(String brand, boolean hasHelmet) {
        super(brand);
        this.hasHelmet = hasHelmet;
    }
    
    void showDetails() {
        display();  // Inherited method
        System.out.println("Has Helmet: " + hasHelmet);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Bike bike = new Bike("Honda", true);
        
        car.showDetails();  // Car-specific output
        bike.showDetails(); // Bike-specific output
    }
}
/* Output:
Brand: Toyota
Wheels: 4
Brand: Honda
Has Helmet: true
*/