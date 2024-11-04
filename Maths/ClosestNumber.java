package Maths;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-04
 * Time: 17:14
 */

public class ClosestNumber {
    public static int closestNumber(int a, int b, int x) {
        // Write your code here
             double power = Math.pow(a, b);
    
        // Calculate the closest multiple of x
        int quotient = (int) Math.round(power / x);
        int closestMultiple = quotient * x;
    
        return closestMultiple;
    }    
}
