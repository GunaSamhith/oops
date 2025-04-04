public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception caught");
        } finally {
            System.out.println("This block will always execute");
        }
    }
}