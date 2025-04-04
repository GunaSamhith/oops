abstract class Vehicle {
        public void start() {
        System.out.println("Vehicle is starting.");
    }

        public abstract void fuelEfficiency();
}

class Car extends Vehicle {
    @Override
    public void fuelEfficiency() {
        System.out.println("Car fuel efficiency is 15 km/l.");
    }
}

class Bike extends Vehicle {
    @Override
    public void fuelEfficiency() {
        System.out.println("Bike fuel efficiency is 40 km/l.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.fuelEfficiency();

        myBike.start();
        myBike.fuelEfficiency();
    }
}