package homework_week8_java;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg. Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme6_Triangle {
    //declare main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // create scanner to read user input
        System.out.println("Input number of rows: ");
        int numRows = s.nextInt();
        s.close(); // close scanner to avoid leakage
        //Loop to print the number triangle pattern

        for (int i = 1; i <= numRows; i++) {
            //loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //Move to the next line for the next row
            System.out.println();
        }
    }
}
