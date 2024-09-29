public class Book {
    // Instance variables (package-private by default)
    String bookName;   // Name of the book
    String isbnNumber; // ISBN number of the book
    String authorName; // Author of the book
    String publisher;   // Publisher of the book

    // Constructor to initialize the instance variables
    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    // Set methods
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Get methods
    public String getBookName() {
        return bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    // Method to get book information
    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN Number: " + isbnNumber + "\n" +
               "Author Name: " + authorName + "\n" +
               "Publisher: " + publisher;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("Effective Java", "978-0134686097", "Joshua Bloch", "Addison-Wesley");

        // Display book information
        System.out.println(book1.getBookInfo());

        // Modify and display updated information
        book1.setBookName("Effective Java (2nd Edition)");
        System.out.println("\nUpdated Book Information:");
        System.out.println(book1.getBookInfo());
    }
}
