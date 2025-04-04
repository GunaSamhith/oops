public class ExceptionPropagation {
    void method1() {
        method2();
    }
    
    void method2() {
        try {
            method3();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in method2");
        }
    }
    
    void method3() {
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.method1();
        System.out.println("Program continues...");
    }
}