package DynamicProgramming;

import java.util.*;

public class FrogJump2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] b = new long[n+1];
        int k=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            b[i] = scanner.nextLong();
        }
        
        long[] dp = new long[n+1];

        dp[1]=0;

        dp[2]=Math.abs(b[1]-b[2]);

        for(int i=3;i<=n;i++){
            long ans=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){

                ans=Math.min(ans,dp[i-j]+Math.abs(b[i]-b[i-j]));
            }
            dp[i]=ans;
        }
        System.out.println(Arrays.toString(dp));
        scanner.close();
    }
}
