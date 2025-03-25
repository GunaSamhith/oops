class VarargsExample {
    // Method with one argument
    void printNumbers(int a) {
        System.out.println("Single number: " + a);
    }

    // Method with multiple arguments using varargs
    void printNumbers(int... numbers) {
        System.out.print("Multiple numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarargsExample obj = new VarargsExample();
        obj.printNumbers(10);
        obj.printNumbers(1, 2, 3, 4, 5);
    }
}