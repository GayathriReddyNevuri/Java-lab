import java.util.*;

public class IntegerDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter first number (Num1): ");
            String input1 = scanner.nextLine();
            System.out.print("Enter second number (Num2): ");
            String input2 = scanner.nextLine();

            // Parse inputs to integers
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // Perform division
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Optionally, close the scanner if needed in a different context
            // scanner.close();
        }
    }
}
