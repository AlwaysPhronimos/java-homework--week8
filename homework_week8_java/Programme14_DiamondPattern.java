package homework_week8_java;

/**
 * Write a programme in Java display the pattern like a diamond.
 * While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */
public class Programme14_DiamondPattern {

    public static void main(String[] args) {
        int n = 7; // Number of rows in the diamond

        //Print the upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // print the lower part of diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
