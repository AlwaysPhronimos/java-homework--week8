package homework_week8_java;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int num = s.nextInt();

        printFibonacciSequence(num);
        s.close();
    }

    public static void printFibonacciSequence(int numTerms) {
        int firstTerm = 1;
        int secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

}
