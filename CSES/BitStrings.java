package CSES;

import java.util.*;
public class BitStrings {

    public  static long modPow(long base, long exp, int mod) {
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
        long n=sc.nextInt();
        int MOD=1000000007;
        long ans=(modPow(2, n,MOD ))%MOD;
        System.out.println(ans);
        sc.close();
    }
}
