package homework_week8_java;

import java.util.Scanner;

/**
 * Write a Java programme that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3VowelOrConsonant {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = s.nextLine(); // Read a full line of input

        // Check if the input is a single character
        if (input.length() == 1) {
            char ch = input.charAt(0);

            //Check if the input is a single character
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Convert the character to lowercase for easy comparison
                char lowercaseCh = Character.toLowerCase(ch);

                //check if the lowercase character is a vowel
                if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u') {
                    System.out.println("Input letter is Vowel.");
                } else {
                    System.out.println("Input letter is Consonant.");
                }
            } else {
                System.out.println("Invalid input: Not an alphabet letter");
            }
        } else {
            System.out.println("Invalid input length should  be 1");
        }
        s.close();
    }
}



