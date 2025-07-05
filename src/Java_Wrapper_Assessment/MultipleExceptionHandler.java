package Java_Wrapper_Assessment;

public class MultipleExceptionHandler {
    public static void main(String[] args) {
        try {
            // Example operations that might throw exceptions
            int[] numbers = {1, 2, 3};


            // int result = 10 / 0; // ArithmeticException (division by zero)
            int value = numbers[5]; // ArrayIndexOutOfBoundsException (invalid index)

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Multi-catch block for both exception types
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("💡 Explanation: Multi-catch block handles both exception types");
        }
    }
}
