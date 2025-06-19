package Tasks;

abstract class Parent {
    abstract void show(); // Abstract method

    void display() {      // Concrete method
        System.out.println("Concrete method in abstract class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Abstract method implemented");
    }
}

public class AbstractVsConcrete {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
    }
}
