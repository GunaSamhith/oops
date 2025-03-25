// Parent Interface 1
interface Engine {
    void startEngine();
}

// Parent Interface 2
interface Vehicle {
    void drive();
}

// Derived Interface
interface Car extends Engine, Vehicle {
    void honk();
}

// Class implementing Car (which inherits Engine and Vehicle)
class Tesla implements Car {
    public void startEngine() {
        System.out.println("Tesla engine started silently.");
    }

    public void drive() {
        System.out.println("Tesla is driving on autopilot.");
    }

    public void honk() {
        System.out.println("Tesla horn: Beep Beep!");
    }
}

// Main Class
public class HybridInheritanceExample2 {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.startEngine();
        myTesla.drive();
        myTesla.honk();
    }
}