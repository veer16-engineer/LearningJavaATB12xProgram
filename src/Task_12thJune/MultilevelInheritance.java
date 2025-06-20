package Task_12thJune;

class Grandparent {
    void familyName() {
        System.out.println("Family: Smith");
    }
}

class Parent extends Grandparent {
    void parentName() {
        System.out.println("Parent: John Smith");
    }
}

class Child extends Parent {
    void childName() {
        System.out.println("Child: Emily Smith");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.familyName();  // From Grandparent
        child.parentName();   // From Parent
        child.childName();    // From Child
    }
}
