abstract class Vehicle {
    
    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
    
    
    public abstract void start();
}


class Car extends Vehicle {
        @Override
    public void start() {
        System.out.println("Car is starting with a key.");
    }
}

class Bike extends Vehicle {
    
    @Override
    public void start() {
        System.out.println("Bike is starting with a button.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

                myCar.start();         
        myCar.stop();   
        myBike.start(); 
        myBike.stop();  
}
