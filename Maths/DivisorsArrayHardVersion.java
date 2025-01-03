package Maths;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class DivisorsArrayHardVersion {
    static class StdIn
    {
        BufferedReader br;
        StringTokenizer st;

        public StdIn()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    private static final StdIn in=new StdIn();
    private static final PrintWriter out=new PrintWriter(System.out);
    static final int N = (int) 1e7 + 7;
    static final int MOD = (int) 1e9 + 7;
    static int[] lp = new int[N + 1]; // Smallest prime factor array
    static ArrayList<Integer> primes = new ArrayList<>();

    // Function for binary exponentiation
    static long binpow(long a, long b, long mod) {
        a %= mod;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    // Function to calculate modular inverse using Fermat's Little Theorem
    static long modInv(long n, long mod) {
        return binpow(n, mod - 2, mod);
    }

    // Linear sieve to calculate smallest prime factor (spf)
    static void linearSieve() {
        for (int i = 2; i <= N; ++i) {
            if (lp[i] == 0) {
                lp[i] = i;
                primes.add(i);
            }
            for (int j = 0; j < primes.size() && i * primes.get(j) <= N; ++j) {
                lp[i * primes.get(j)] = primes.get(j);
                if (primes.get(j) == lp[i]) break;
            }
        }
    }

    // Function to calculate the prime factorization frequency map
    static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> factorMap = new HashMap<>();
        while (n > 1) {
            factorMap.put(lp[n], factorMap.getOrDefault(lp[n], 0) + 1);
            n /= lp[n];
        }
        return factorMap;
    }

    public static void main(String[] args) {

        // Precompute smallest prime factors
        linearSieve();

        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();

        // Precompute prime factor frequencies for M!
        Map<Integer, Integer> globalPrimeFreq = new HashMap<>();
        for (int i = 2; i <= m; i++) {
            int j = i;
            while (j > 1) {
                globalPrimeFreq.put(lp[j], globalPrimeFreq.getOrDefault(lp[j], 0) + 1);
                j /= lp[j];
            }
        }

        // Calculate result for M!
        long res = 1;
        for (Map.Entry<Integer, Integer> entry : globalPrimeFreq.entrySet()) {
            res *= (entry.getValue() + 1);
            res %= MOD;
        }

        // Process each element in array A
        StringBuilder result = new StringBuilder();
        for (int value : a) {
            long ans = res;

            // Get prime factorization of A[i]
            Map<Integer, Integer> localPrimeFreq = primeFactorization(value);
            for (Map.Entry<Integer, Integer> entry : localPrimeFreq.entrySet()) {
                int prime = entry.getKey();
                int freq = entry.getValue();

                ans *= (globalPrimeFreq.getOrDefault(prime, 0) + freq + 1);
                ans %= MOD;

                ans *= modInv(globalPrimeFreq.getOrDefault(prime, 0) + 1, MOD);
                ans %= MOD;
            }
            result.append(ans).append(" ");
        }

        out.println(result.toString().trim());
        out.flush();
    }
}
