package PangramSentence;

import java.util.Scanner;

public class PangramChecker {
    // Method to check if the input string is a pangram
    public static boolean isPangram(String sentence) {
        // Convert the sentence to lowercase and remove spaces
        sentence = sentence.toLowerCase().replaceAll(" ", "");

        // Create a boolean array to mark presence of each letter
        boolean[] alphabetPresent = new boolean[26];

        // Iterate over each character in the sentence
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // Mark the index corresponding to the letter
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all letters of the alphabet are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;  // All letters are present
    }
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Check if the input is a pangram
        if (isPangram(inputSentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        // Close the scanner
        scanner.close();
    }

}
