package homework_week8_java;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme8_RightAngleTriangle {

    public static void main(String[] args) {
        int n = 5; //Number of rows in the triangle

        for (int i = 1; i <= n; i++) { //// Outer loop for iterating through rows

            for (int j = 1; j <= i; j++)  // Inner loop for printing "@" symbols in each row
            {
                System.out.print("@");
            }
            System.out.println(); // Move to the next line for the next row
        }

    }
}
