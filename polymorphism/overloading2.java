class Parent {
    void show() {
        System.out.println("Parent class method");
    }

    void show(int a) {
        System.out.println("Parent class method with argument: " + a);
    }
}

class Child extends Parent {
    void show(double a) {
        System.out.println("Child class method with double argument: " + a);
    }
}

public class OverloadInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(); // Calls Parent's method
        obj.show(10); // Calls Parent's method with int
        obj.show(5.5); // Calls Child's method with double
    }
}