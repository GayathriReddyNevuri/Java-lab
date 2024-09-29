public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per Item: $%.2f%n", pricePerItem);
        System.out.printf("Total Invoice Amount: $%.2f%n", getInvoiceAmount());
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("A123", "Hammer", 5, 12.99);
        invoice.displayInvoice();
    }
}
