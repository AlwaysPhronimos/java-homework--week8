package homework_week8_java;

import java.util.Scanner;

/**
 * Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 */
public class Programme4DigitSumChallenge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (s.hasNextInt()) {
            int number = s.nextInt();
            int result = sumDigits(number);

            if (result == -1) {
                System.out.println("Invalid input: Not a valid number.");
            } else {
                System.out.println("Sum of digits: " + result);
            }
       } else {
            System.out.println("Invalid input: Not an integer.");
        }
            s.close();

    }

    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1; // Return -1 for invalid values
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the least-significant digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Discard the least-significant digit
        }
        return sum;
    }
}

