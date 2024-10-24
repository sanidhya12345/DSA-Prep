package CSES;

// Author: Sanidhya Varshney
// Date: 2024-10-24 18:23
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Calculate the sum of the first n natural numbers
        long sum = (long) n * (n + 1) / 2;
        
        // If the sum is odd, it's impossible to divide into two sets with equal sum
        if (sum % 2 != 0) {
            System.out.println("NO");
        }
        else{
            // If sum is even, we can proceed to divide the set
        System.out.println("YES");
        
        // We want each set to sum to sum/2
        long target = sum / 2;
    
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        long count1=0;
        long count2=0;
        // Greedily add numbers to set1 until we reach the target sum
        for (int i = n; i > 0; i--) {
            if (target >= i) {
                sb1.append(i).append(" ");
                target -= i;
                count1++;
            } else {
                sb2.append(i).append(" ");
                count2++;
            }
        }
        
        // Output the first set
        System.out.println(count1);
        System.out.println(sb1.toString().trim());
        // Output the second set
        System.out.println(count2);
        System.out.println(sb2.toString().trim());
        }
        sc.close();
    }
}
