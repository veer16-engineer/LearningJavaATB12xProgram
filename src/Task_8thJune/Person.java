package Task_8thJune;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

