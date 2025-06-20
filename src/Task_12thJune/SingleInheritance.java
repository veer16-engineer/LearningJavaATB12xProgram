package Task_12thJune;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Calls overridden method
    }
}