package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-05
 * Time: 11:09
 */

import java.util.*;
public class GoogleSWEIntern {
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        int i=1;
        while (i<=n) {
            arr[i]=sc.nextInt();
            i++;
        }
        int [] dp=new int[n+1];
        dp[1]=arr[1];
        dp[2]=arr[1]+arr[2];
        dp[3]=arr[1]+arr[2]+arr[3];
        dp[4]=Math.max(dp[3]+arr[4],dp[1]+arr[4]);
        dp[5] = Math.max(dp[4] + arr[5],dp[2] + arr[5]);
        for(int j=6;j<=n;j++){
            dp[j]=Math.max(dp[j-1]+arr[j],Math.max(dp[j-3]+arr[j],dp[j-5]+arr[j]));
        }
        System.out.println(dp[n]);
        sc.close();
    }
}