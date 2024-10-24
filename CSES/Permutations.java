package CSES;

// Author: Sanidhya Varshney
// Date: 2024-10-24 17:23
import java.util.*;
public class Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        }
        
        StringBuilder result = new StringBuilder();
        
        // Output all even numbers first
        for (long i = 2; i <= n; i += 2) {
            result.append(i).append(" ");
        }
        
        // Output all odd numbers next
        for (long i = 1; i <= n; i += 2) {
            result.append(i).append(" ");
        }
        
        // Print the result
        System.out.println(result.toString().trim());
        
        sc.close();
    }
}