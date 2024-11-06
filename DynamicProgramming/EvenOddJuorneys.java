package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-06
 * Time: 16:36
 */

import java.util.*;
public class EvenOddJuorneys {
    public static void main(String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }

        //create a 2-d dp matrix 
        //dp[i][1]->odd number journey till ith index
        //dp[i][2]->even number journey till ith index
        int[][] dp = new int[100005][3];
        if(a[1]%2==0){
            dp[1][2]=1;
        }
        else{
            dp[1][1]=1;
        }
        int i=2;
        while(i<=n){
            if (a[i] % 2 == 0) {
                dp[i][2] = dp[i - 1][2] + dp[i - 2][2];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            } else {
                dp[i][2] = dp[i - 1][1] + dp[i - 2][1];
                dp[i][1] = dp[i - 1][2] + dp[i - 2][2];
            }
            i++;
        }
        System.out.println("Odd number journeys: "+dp[n][1]);
        System.out.println("Even number journeys: "+dp[n][2]);
        sc.close();
    }
}
