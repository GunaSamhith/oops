class Parent {
    Parent getObject() {
        return new Parent();
    }
}

class Child extends Parent {
    @Override
    Child getObject() {
        return new Child();
    }
}

public class CovariantReturnExample {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getObject().getClass().getName());
    }
}