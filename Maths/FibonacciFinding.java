package Maths;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-07
 * Time: 17:47
 */

import java.io.*;
import java.util.StringTokenizer;
public class FibonacciFinding {
    static final StdIn in = new StdIn();
    static final PrintWriter out = new PrintWriter(System.out);

    static int solve(int a,int b,int n){
        int f1=a;
        int f2=b;
        while (n--!=0) {
            int c=f1+f2;
            f1=f2;
            f2=c;
        }
        return f2%1000000007;
    }
    public static void main(String[] args) {
        // Your code here
        int test=in.nextInt();

        while (test--!=0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            out.println(solve(a, b, n-1));
        }
        out.flush();
    }
}
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

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}