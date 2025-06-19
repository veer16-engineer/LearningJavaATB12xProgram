package Tasks;

public class AutoboxingUnboxing {

    public static void main(String[] args) {

            int a = 10;

            // Autoboxing: primitive to wrapper
            Integer obj = a;
            System.out.println("Autoboxed Integer: " + obj);

            // Unboxing: wrapper to primitive
            int b = obj;
            System.out.println("Unboxed int: " + b);
        }
    }

