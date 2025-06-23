package Java_OOP_Assessment;

public class Main {

    public static void main(String[] args) {
        // Create Dog and Cat objects
        Challenge5_Animal dog = new Dog();
        Challenge5_Animal cat = new Cat();

        // Call makeSound() using polymorphism
        dog.makeSound();
        cat.makeSound();
    }
}
