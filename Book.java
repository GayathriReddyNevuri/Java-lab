public class Book {
    String bookName;
    String isbnNumber;
    String authorName;
    String publisher;

    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

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

    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN Number: " + isbnNumber + "\n" +
               "Author Name: " + authorName + "\n" +
               "Publisher: " + publisher;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java", "978", "Bloch", "Wesley");
        System.out.println(book1.getBookInfo());
        book1.setBookName("Java (2nd Edition)");
        System.out.println("\nUpdated Book Information:");
        System.out.println(book1.getBookInfo());
    }
}
