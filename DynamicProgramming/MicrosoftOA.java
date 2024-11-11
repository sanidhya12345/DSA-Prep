package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-11
 * Time: 10:34
 */


import java.io.*;
public class MicrosoftOA {
    static final StdIn in = new StdIn();
    static final PrintWriter out = new PrintWriter(System.out);

    static long findWays1246(int n){
        long [] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            if(i>=4){
                dp[i]+=dp[i-4];
            }
            if(i>=6){
                dp[i]+=dp[i-6];
            }
        }
        return dp[n];
    }

    //dp[i][0]=>0 times 4 is used.
    //dp[i][1]=>1 time 4 is used.
    //dp[i][2]=>2 times 4 is used

    static long findways1246Atmost4_2Times(int n){
        long [][] dp=new long[n+1][3];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            //when 0 times 4 is used.
            if(i-1>=0) dp[i][0]+=dp[i-1][0];
            if(i-2>=0) dp[i][0]+=dp[i-2][0];
            if(i-6>=0) dp[i][0]+=dp[i-6][0];

            //when 1 times 4 is used.
            if(i-1>=0) dp[i][1]+=dp[i-1][1];
            if(i-2>=0) dp[i][1]+=dp[i-2][1];
            if(i-4>=0) dp[i][1]+=dp[i-4][0];
            if(i-6>=0) dp[i][1]+=dp[i-6][1];

            //when 2 times 4 is used.
            if(i-1>=0) dp[i][2]+=dp[i-1][2];
            if(i-2>=0) dp[i][2]+=dp[i-2][2];
            if(i-4>=0) dp[i][2]+=dp[i-4][1];
            if(i-6>=0) dp[i][2]+=dp[i-6][2];
        }
        return dp[n][0]+dp[n][1]+dp[n][2];
    }

    public static void main(String[] args) {
        // Your code here
        int n=in.nextInt();
        //out.println(findWays1246(n));
        out.println(findways1246Atmost4_2Times(n));
        out.flush();
    }
}
