package Codeforces;
import java.io.*;
import java.util.*;

public class RudolfAndImbalance {
    static final StdIn in = new StdIn();
    static final PrintWriter out = new PrintWriter(System.out);
    static long max(long a,long b,long c) {
    	return Math.max(a,Math.max(b,c));
    }
    public static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        long[] d = new long[m];
        for (int i = 0; i < m; i++) {
            d[i] = in.nextLong();
        }

        long[] f = new long[k];
        for (int i = 0; i < k; i++) {
            f[i] = in.nextLong();
        }

        Arrays.sort(d);
        Arrays.sort(f);

        long m1 = 0, m2 = 0;
        int ind = -1;

        // Find the largest gap and second largest gap in array `a`
        for (int i = 1; i < n; i++) {
            long e = a[i] - a[i - 1];
            m2 = Math.max(m2, e);
            if (m2 > m1) {
                long temp = m1;
                m1 = m2;
                m2 = temp;
                ind = i - 1;
            }
        }

        long ans = m1;
        long target = (a[ind] + a[ind + 1]) / 2;

        // Try to minimize the imbalance by binary searching `f` for each model complexity `d`
        for (long model : d) {
            int l = 0, r = k - 1;

            // Binary search to find closest `f` value to `target`
            while (r - l > 1) {
                int mid = (r + l) / 2;
                if (model + f[mid] <= target) {
                    l = mid;
                } else {
                    r = mid;
                }
            }

            // Update `ans` with the minimum imbalance found
            ans = Math.min(ans, max(m2, Math.abs((model + f[l]) - a[ind]), Math.abs((model + f[l]) - a[ind + 1])));
            ans = Math.min(ans, max(m2, Math.abs((model + f[r]) - a[ind]), Math.abs((model + f[r]) - a[ind + 1])));
        }

        out.println(ans);
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }
}

// Utility class for fast input handling
class StdIn {
    BufferedReader br;
    StringTokenizer st;

    public StdIn() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }
}
