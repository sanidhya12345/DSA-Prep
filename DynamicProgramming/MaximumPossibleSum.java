package DynamicProgramming;
import java.util.*;

/*
1. Sum of those elements is maximum(Sum of the subset is maximum) .
2. No two elements in the subset should be consecutive.
 */
public class MaximumPossibleSum {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,8};
        int [] dp=new int[arr.length+1];
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        System.out.println(Arrays.toString(dp));
    }
}
