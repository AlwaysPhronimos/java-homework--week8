package homework_week8_java;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        s.close();
    }
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length(); //count the number of digits
        while (number > 0){
            int digit = number % 10; //Extract the last digit
            result += Math.pow(digit,n); //Add the digit number of digits to the result
            number /= 10; //move to the next digit
        }
        return result == originalNumber; //Check if the result is equal to the original number
    }
}
