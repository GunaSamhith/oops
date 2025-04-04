// Abstract class
abstract class Vehicle {
    // Concrete method
    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
    
    // Abstract method (no implementation in the parent class)
    public abstract void start();
}

// Subclass of Vehicle
class Car extends Vehicle {
    // Providing implementation of abstract method
    @Override
    public void start() {
        System.out.println("Car is starting with a key.");
    }
}

class Bike extends Vehicle {
    // Providing implementation of abstract method
    @Override
    public void start() {
        System.out.println("Bike is starting with a button.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Calling the methods
        myCar.start();  // Implementation from Car
        myCar.stop();   // Common method from Vehicle
        myBike.start(); // Implementation from Bike
        myBike.stop();  // Common method from Vehicle
    }
}
