public class Invoice {
    // Instance variables (package-private by default)
    String partNumber;        // Part number of the item
    String partDescription;   // Description of the item
    int quantity;             // Quantity of items being purchased
    double pricePerItem;      // Price of each item

    // Constructor to initialize the instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate the total invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem; // Total amount = quantity * price per item
    }

    // Method to display invoice details
    public void displayInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per Item: $%.2f%n", pricePerItem);
        System.out.printf("Total Invoice Amount: $%.2f%n", getInvoiceAmount());
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Creating an Invoice object with example values
        Invoice invoice = new Invoice("A123", "Hammer", 5, 12.99);

        // Displaying the invoice details
        invoice.displayInvoice();
    }
}
