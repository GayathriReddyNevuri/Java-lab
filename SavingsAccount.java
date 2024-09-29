public class SavingsAccount {
    // Static variable to store the annual interest rate for all account holders
    static double annualInterestRate;

    // Instance variable to store the savings balance of the account holder
    double savingsBalance;

    // Constructor to initialize the savings balance
    public SavingsAccount(double initialBalance) {
        if (initialBalance > 0) {
            savingsBalance = initialBalance;
        } else {
            savingsBalance = 0; // Set to zero if the initial balance is invalid
        }
    }

    // Method to calculate the monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest; // Add monthly interest to the balance
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate; // Set the new annual interest rate
    }

    // Method to display the current balance
    public double getSavingsBalance() {
        return savingsBalance; // Return the current savings balance
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Set the annual interest rate
        SavingsAccount.modifyInterestRate(0.05); // 5%

        // Create a SavingsAccount object with an initial balance
        SavingsAccount account1 = new SavingsAccount(1000); // Initial balance in rupees
        System.out.println("Initial Balance: ₹" + account1.getSavingsBalance());

        // Calculate monthly interest and update the balance
        account1.calculateMonthlyInterest();
        System.out.printf("Balance after one month: ₹%.2f%n", account1.getSavingsBalance());

        // Modify the interest rate
        SavingsAccount.modifyInterestRate(0.07); // Change to 7%

        // Calculate monthly interest again with the new rate
        account1.calculateMonthlyInterest();
        System.out.printf("Balance after second month: ₹%.2f%n", account1.getSavingsBalance());
    }
}
