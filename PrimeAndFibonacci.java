public class PrimeAndFibonacci {

    // Function to check if a number is a perfect square
    static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    // Function to check if a number is a Fibonacci number
    static boolean isFibonacci(int num) {
        // A number is Fibonacci if one or both of (5 * n^2 + 4) or (5 * n^2 - 4) is a perfect square
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print numbers that are both prime and Fibonacci
    static void printPrimeAndFibonacci(int limit) {
        System.out.println("Prime Fibonacci numbers below " + limit + ":");

        for (int i = 2; i <= limit; i++) {
            // Check if the number is both prime and Fibonacci
            if (isPrime(i) && isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int limit = 100000; // Define the limit
        printPrimeAndFibonacci(limit); // Call the function to print numbers
    }
}
