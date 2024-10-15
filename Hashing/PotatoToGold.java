package Hashing;
import java.util.*;
public class PotatoToGold {
    static final long MOD = 1000000007;

    // Fast exponentiation method to compute (base^exp) % mod
    public static long modPow(long base, long exp, long mod){
        long result = 1;
        base %= mod;
        while(exp > 0){
            if((exp & 1) == 1){
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while(T-- > 0){
            int N = sc.nextInt(); // Number of elements
            long K = sc.nextLong(); // The integer K
            long[] A = new long[N];
            for(int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            // Count the frequency of each remainder modulo K
            long[] count = new long[(int)K];
            for(int i = 0; i < N; i++) {
                long rem = A[i] % K;
                if(rem < 0) rem += K; // Handle negative remainders if any
                count[(int)rem]++;
            }
            long ans = 1;
            // Handle remainder 0
            ans = (ans * (1 + count[0])) % MOD;

            // Iterate through each possible remainder
            for(int r = 1; r <= K/2 && r < K; r++){
                if(r == K - r && (K % 2 == 0)){
                    // If K is even and r is exactly half of K, similar to remainder 0
                    ans = (ans * (1 + count[r])) % MOD;
                }
                else{
                    if(r != K - r){
                        long a = modPow(2, count[r], MOD);
                        long b = modPow(2, count[(int)(K - r)], MOD);
                        ans = (ans * ((a + b - 1 + MOD) % MOD)) % MOD; // Ensure non-negative
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
