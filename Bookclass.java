package skill5;

// Data class (not public)
class Book {
    // Private attributes
    private String title;
    private String author;
    private double price;

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    // toString method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: ₹" + price;
    }
}

// Main class (public) — file name must match this class name
public class Bookclass {
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book();

        // Set values using setters
        myBook.setTitle("Java Made Easy");
        myBook.setAuthor("S. Kumar");
        myBook.setPrice(499.99);

        // Printing object directly calls toString() automatically
        System.out.println(myBook);
    }
}
