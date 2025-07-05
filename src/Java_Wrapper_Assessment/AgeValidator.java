package Java_Wrapper_Assessment;

public class AgeValidator {

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            int age1 = 20;
            checkAge(age1);  // Valid age

            int age2 = 15;
            checkAge(age2);  // Throws exception
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}
