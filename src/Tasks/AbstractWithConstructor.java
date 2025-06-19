package Tasks;

abstract class Base {
    Base() {
        System.out.println("Abstract class constructor called");
    }

    void showMessage() {
        System.out.println("Method from abstract class");
    }
}

class Derived extends Base {}

public class AbstractWithConstructor {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.showMessage();
    }
}
