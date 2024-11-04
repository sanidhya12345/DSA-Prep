package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-04
 * Time: 09:31
 */

import java.util.*;
public class AmazonOASummerSchool {
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        long [] dp=new long[n+1];
        dp[1]=0;
        dp[2]=Math.abs(arr[2]-arr[1]);
        dp[3]=Math.abs(arr[3]-arr[2]);
        for(int i=4;i<=n;i++){
            dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-3]+Math.abs(arr[i]-arr[i-3]));
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
