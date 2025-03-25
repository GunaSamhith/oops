class Parent {
    protected void display() {
        System.out.println("Protected method in Parent");
    }
}

class Child extends Parent {
    @Override
    public void display() { // Can increase visibility (protected → public)
        System.out.println("Overridden method in Child");
    }
}

public class AccessModifierExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}