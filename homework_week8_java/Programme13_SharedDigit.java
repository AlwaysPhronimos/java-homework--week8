package homework_week8_java;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * 1.hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * 2.hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * 3.hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme13_SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 <10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        }
        int digit1a = number1 % 10; // Extract the digit from the first number.
        int digit1b = number1/10;

        int digit2a = number2 % 10; // Extract the digits from the second number.
        int digit2b = number2 / 10;

        if (digit1a == digit2a || digit1a == digit2b || digit1b == digit2a || digit1b == digit2b) {
            return true;
        }
        //if shared digit are not found, return false.
        return false;
    }
}
