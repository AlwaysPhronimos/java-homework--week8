package homework_week8_java;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme2MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE; //Initialize min with a large value
        int max = Integer.MIN_VALUE; // Initialize max with a small value

        while (true) {
            System.out.println("Enter number: "); // Prompt user for input

            if (sc.hasNextInt()) { //check if the input is an integer
                int num = sc.nextInt();
                min = Math.min(min, num); // Update the minimum number
                max = Math.max(max, num); // Update the maximum number
            } else {
                break; //Exit the loop as invalid input
            }
            sc.nextLine();
        }

        //check if any valid numbers were entered
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("Invalid input entered.");
        } else {
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        }
        sc.close();
    }
}
