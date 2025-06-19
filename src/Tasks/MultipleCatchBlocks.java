package Tasks;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int result = arr[5] / 0;  // ArrayIndexOutOfBounds + Arithmetic
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}
