package Tasks;

public class Book {

    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("The Indian", "Virbhadra Swami ", 399.0);

        // Displaying book details
        book1.displayDetails();
    }
}
