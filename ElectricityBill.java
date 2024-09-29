import java.util.Scanner;

public class ElectricityBill {
    // Instance variables
    String consumerNo;
    String consumerName;
    double previousReading;
    double currentReading;
    String connectionType;

    // Constructor
    public ElectricityBill(String consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    // Method to calculate the bill amount
    public double calculateBill(double tariff) {
        return (currentReading - previousReading) * tariff; // Calculate bill
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Consumer No: ");
        String consumerNo = scanner.nextLine();
        System.out.print("Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Previous Month Reading: ");
        double previousReading = scanner.nextDouble();
        System.out.print("Current Month Reading: ");
        double currentReading = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Connection Type (Domestic/Commercial): ");
        String connectionType = scanner.nextLine();
        System.out.print("Tariff Rate (per unit in ₹): ");
        double tariff = scanner.nextDouble();

        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);

        // Calculate and display the bill
        double billAmount = bill.calculateBill(tariff);
        System.out.printf("Electricity Bill for %s (%s): ₹%.2f%n", consumerName, connectionType, billAmount);

        // Close the scanner
        // scanner.close(); // Uncomment if you want to close the scanner
    }
}
