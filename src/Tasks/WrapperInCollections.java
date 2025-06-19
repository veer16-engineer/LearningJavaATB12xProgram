package Tasks;
import java.util.ArrayList;

public class WrapperInCollections {
    public static void main(String[] args) {
        // ArrayList cannot store primitives like int directly
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);  // Autoboxing: int → Integer
        numbers.add(20);
        numbers.add(30);

        System.out.println("Elements in ArrayList: " + numbers);
    }
}