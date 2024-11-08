package DynamicProgramming;

import java.util.*;
public class CitiesTravel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] a=new long[n+1];
        long [] b=new long[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextLong();
        }
        for(int i=1;i<=n;i++){
            b[i]=sc.nextLong();
        }
        long [][] dp=new long[100005][2];
        dp[1][0]=a[1];
        dp[1][1]=b[1];
        for(int i=2;i<=n;i++){
            dp[i][0]=Math.max(a[i]+dp[i-1][0],a[i]+dp[i-2][1]);
            dp[i][1]=Math.max(b[i]+dp[i-1][1],b[i]+dp[i-2][0]);
        }
        System.out.println(dp[n][0]+" "+dp[n][1]);
        sc.close();
    }
}
