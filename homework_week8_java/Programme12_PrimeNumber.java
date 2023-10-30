package homework_week8_java;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12_PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = s.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        s.close();
    }

    // Function to check if a number is prime number
    public static boolean isPrime(int number) {
        if (number <= 1) { //Check if the number is less than or equal to 1, it is not prime number7
            return false;
        }
        //Check  for divisibility by numbers from 2 to the square root of the number.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
return false; //if the number is divisible by any integer, it's not prime.
            }
        }
        return true; // If the number is not divisible by any integer in the above loop than it is 13prime
    }
}
