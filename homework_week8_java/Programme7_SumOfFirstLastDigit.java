package homework_week8_java;

import java.util.Scanner;

/**
 * First And Last Digit Sum
 * PRIME TESTING
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 */
public class Programme7_SumOfFirstLastDigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // create scanner to read user input
        System.out.println("Enter a number: ");
        if (s.hasNextInt()) {
            int number = s.nextInt();
            int sum = sumFirstAndLastDigit(number);

            if (sum != -1) {
                System.out.println("Sum of the first and last digit: " + sum);

            } else {
                System.out.println("Invalid input: Number is negative.");
            }
        } else {
            System.out.println("Invalid input: Not an integer.");
        }
        s.close();
    }
// sumFirstAndLastDigit with one parameter of type int called number
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; //return -1 for negative values
        }
        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }
}

