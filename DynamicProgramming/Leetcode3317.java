package DynamicProgramming;

import java.util.*;
public class Leetcode3317 {
    public  static long modPow(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) { // If exp is odd, multiply base with result
                result = (result * base) % mod;
            }
            base = (base * base) % mod; // Square the base
            exp >>= 1; // Divide exp by 2
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int MOD = 1000000007;
        long[][] dp = new long[n + 1][x + 1]; // For storing the value of c1, c2, c3, ... cx
        dp[1][1] = x;
    
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                dp[i][j] = (dp[i - 1][j] * j + dp[i - 1][j - 1] * (x - (j - 1))) % MOD;
            }
        }
        long total = 0;
        for (int i = 1; i <= x; i++) {
            total = (total + dp[n][i] * modPow(y, i, MOD)) % MOD; // Modular exponentiation
        }
        sc.close();
        System.out.println((int)(total));
    }
}
