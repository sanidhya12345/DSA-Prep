package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-08
 * Time: 09:18
 */

import java.io.*;
import java.util.StringTokenizer;
public class GoldManSachs {
    static final StdIn in = new StdIn();
    static final PrintWriter out = new PrintWriter(System.out);
    static int min(int x,int y,int z){
        return Math.min(x,Math.min(y, z));
    }
    public static void main(String[] args) {
        // Your code here
        int n=in.nextInt();
        int [] b=new int[n+1];
        for(int i=1;i<=n;i++){
            b[i]=in.nextInt();
        }

        //dp[i][1]=>backward jump only 1 time is possible
        //dp[i][2]=>forward jump
        int [][] dp=new int[n+1][5];
        dp[1][2]=b[1];
        dp[1][1]=100000000;
        dp[2][2]=100000000;
        dp[2][1]=dp[1][2]+b[2]+b[3];
        int i=3;
        while (i<=n-1) {
            dp[i][2]=b[i]+Math.min(dp[i-2][2],dp[i-2][1]);
            dp[i][1]=dp[i-1][2]+b[i]+b[i+1];
            i++;
        }
        dp[i][2] = b[n] + Math.min(dp[i-2][2],dp[i-2][1]);
        dp[i][1] = 100000000 ; 
        out.println(min(dp[n][2], dp[n-1][2], dp[n-1][1]));
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
