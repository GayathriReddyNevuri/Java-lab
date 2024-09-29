public class SavingsAccount {
    static double annualInterestRate;
    double savingsBalance;

    public SavingsAccount(double initialBalance) {
        if (initialBalance > 0) {
            savingsBalance = initialBalance;
        } else {
            savingsBalance = 0;
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.05); // 5%
        SavingsAccount account1 = new SavingsAccount(1000);
        System.out.println("Initial Balance: ₹" + account1.getSavingsBalance());

        account1.calculateMonthlyInterest();
        System.out.printf("Balance after one month: ₹%.2f%n", account1.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.07);

        account1.calculateMonthlyInterest();
        System.out.printf("Balance after second month: ₹%.2f%n", account1.getSavingsBalance());
    }
}
