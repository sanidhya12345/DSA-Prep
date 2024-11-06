package DynamicProgramming;

import java.util.Scanner;

public class EvenOddJourneys2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }

        int [][] dp=new int[100005][3];
        if (a[1] % 2 == 0) {
            dp[1][2] = 1;
        } else {
            dp[1][1] = 1;
        }
 
        if (a[2] % 2 == 0) {
            dp[2][2] = dp[1][2];
            dp[2][1] = dp[1][1];
        } else {
            dp[2][2] = dp[1][1];
            dp[2][1] = dp[1][2];
        }

        int i=3;
        while (i<=n) {
            if(a[i]%2==0){
                dp[i][2]=dp[i-1][2]+dp[i-2][2]+dp[i-3][2];
                dp[i][1]=dp[i-1][1]+dp[i-2][1]+dp[i-3][1];
            }
            else{
                dp[i][2]=dp[i-1][1]+dp[i-2][1]+dp[i-3][1];
                dp[i][1]=dp[i-1][2]+dp[i-2][2]+dp[i-3][2];
            }
            i++;
        }
        System.out.println("Odd Number of journeys: "+dp[n][1]);
        System.out.println("Even Number of journeys: "+dp[n][2]);
        sc.close();
    }
}
