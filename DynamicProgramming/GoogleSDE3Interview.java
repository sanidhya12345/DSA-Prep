package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-07
 * Time: 10:18
 */

import java.util.*;
public class GoogleSDE3Interview {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        int z = sc.nextInt();
        int b = sc.nextInt();
 
        int[] dp = new int[n + 1];
 
        dp[1] = 0;
 
        int i = 2;
        while (i <= n) {
            int v1 = dp[i - 1] + y;
            int v2 = Integer.MAX_VALUE;
            int v3 = Integer.MAX_VALUE;
            int v4 = Integer.MAX_VALUE;
 
            if (i % 7 == 0) {
                v2 = dp[i / 7] + x;
            }
            if (i % 3 == 0) {
                v3 = dp[i / 3] + z;
            }
            if (i % 5 == 0) {
                v4 = dp[i / 5] + b;
            }
 
            dp[i] = Math.min(v1, Math.min(v2, Math.min(v3, v4)));
            i++;
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
