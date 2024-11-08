package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-08
 * Time: 11:21
 */

import java.io.*;
import java.util.StringTokenizer;
public class BarclaysOa {
    static final StdIn in = new StdIn();
    static final PrintWriter out = new PrintWriter(System.out);
    static int max(int x,int y,int z){
        return Math.max(x,Math.max(y, z));
    }
    public static void main(String[] args) {
        // Your code here
        int n=in.nextInt();
        // int m=in.nextInt();
        int [] easy=new int[n+1];
        int [] hard=new int[n+1];
        int i=1;
        while (i<=n) {
            easy[i]=in.nextInt();
            hard[i]=in.nextInt();
            i++;
        }
        int [][] dp=new int[5000][5];
        dp[1][1]=easy[1]; //easy problem
        dp[1][2]=hard[1]; //hard problem
        dp[1][3]=0; // not task at all

        i=2;
        while (i<=n) {
            dp[i][1]=easy[i]+max(dp[i-1][1], dp[i-1][2], dp[i-1][3]);
            dp[i][2]=hard[i]+dp[i-1][3];
            dp[i][3]=0+max(dp[i-1][1], dp[i-1][2], dp[i-1][3]);
            i++;
        }
        out.println(max(dp[n][1], dp[n][2], dp[n][3]));
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
