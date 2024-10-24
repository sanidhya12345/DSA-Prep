package CSES;

// Author: Sanidhya Varshney
// Date: 2024-10-24 18:23
import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int k = 1; k <= n; k++) {
            // Total ways to place two knights
            long totalPositions = (long) k * k * (k * k - 1) / 2;
            
            // Attacking pairs
            long attackingPositions = 4 * (k - 1) * (k - 2);
            
            // Non-attacking pairs
            long nonAttacking = totalPositions - attackingPositions;
            
            // Output result for k x k board
            System.out.println(nonAttacking);
        }
        
        sc.close();
    }
}
