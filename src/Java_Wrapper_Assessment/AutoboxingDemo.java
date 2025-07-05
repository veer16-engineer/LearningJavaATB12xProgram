package Java_Wrapper_Assessment;

public class AutoboxingDemo {
    public static void main(String[] args) {
        // Autoboxing - primitive int to Integer object
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt;  // Autoboxing

        // Unboxing - Integer object back to primitive int
        int unboxedInt = wrappedInt;       // Unboxing

        System.out.println("Original primitive: " + primitiveInt);
        System.out.println("Autoboxed: " + wrappedInt);
        System.out.println("Unboxed: " + unboxedInt);
        System.out.println("💡 Explanation: Shows automatic conversion between int and Integer");

        // Demonstrating in collections (common use case)
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(20);  // Autoboxing - int 20 to Integer

        int firstNumber = numbers.get(0);  // Unboxing - Integer to int
        System.out.println("\nNumber from list: " + firstNumber);
    }
}
