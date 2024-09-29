import java.util.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Input operator
            System.out.print("Enter an operator (+, -, *, %): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Perform operation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Optionally, close the scanner if needed in a different context
            // scanner.close();
        }
    }
}
