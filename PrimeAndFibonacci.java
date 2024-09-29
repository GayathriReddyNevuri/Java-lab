public class PrimeAndFibonacci {
    static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
    static boolean isFibonacci(int num) {
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static void printPrimeAndFibonacci(int limit) {
        System.out.println("Prime Fibonacci numbers below " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i) && isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int limit = 100000;
        printPrimeAndFibonacci(limit);
    }
}
