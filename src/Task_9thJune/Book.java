package Task_9thJune;

class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "A.P.J Abdul Kalam", 299.50);
        b1.display();
    }
}
