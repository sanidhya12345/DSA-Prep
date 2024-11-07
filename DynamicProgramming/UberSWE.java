package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-07
 * Time: 10:23
 */

import java.util.*;
public class UberSWE {
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp=new int[n+1];
        dp[1]=0;
        int i=2;
        while(i<=n){
            int p1=dp[i-1]+1;
            int p2=Integer.MAX_VALUE;
            int p3=Integer.MAX_VALUE;
            if(i%2==0){
                p2=dp[i/2]+1;
            }
            if(i%3==0){
                p3=dp[i/3]+1;
            }
            dp[i]=Math.min(p1,Math.min(p2, p3));
            i++;
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
