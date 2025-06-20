package Task_12thJune;

class ParentClass {
    ParentClass() {
        System.out.println("Parent class constructor called");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super(); // Optional - compiler adds it automatically
        System.out.println("Child class constructor called");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        new ChildClass();
    }
}
