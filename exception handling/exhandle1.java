public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred!");
        } catch (Exception e) {
            System.out.println("General exception occurred!");
        }
    }
}