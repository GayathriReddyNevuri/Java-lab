import java.util.Scanner;

public class PangramChecker {

    // Function to check if the sentence is a pangram
    static String isPangram(String sentence) {
        // Create a boolean array to mark the presence of each letter
        boolean[] alphabet = new boolean[26];
        int index = 0;
        int count = 0;

        // Convert the sentence to lowercase to handle case insensitivity
        sentence = sentence.toLowerCase();

        // Iterate over the sentence and mark the presence of each letter
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the character is a letter (ignores spaces and punctuation)
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a'; // Map 'a' to 0, 'b' to 1, ..., 'z' to 25
                if (!alphabet[index]) { // Mark only if not already marked
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        // Check if all 26 letters were marked
        return count == 26 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        // Input a sentence from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Call the function to check if it's a pangram and print the result
        System.out.println(isPangram(sentence));
    }
}
