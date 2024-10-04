package DynamicProgramming;

import java.util.*;
public class MaximumSubsetFromTwoArrays {
    public static void main(String[] args) {
        int [] arr1={1,5,3,21234};
        int [] arr2={-4509,200,3,40};
        int [] dp=new int[arr1.length+1];
        int n=arr1.length;
        Arrays.fill(dp, 0);
        dp[0]=Math.max(arr1[0],arr2[0]);
        dp[1]=Math.max(dp[0],Math.max(arr1[1],arr2[1]));
        for(int i=2;i<arr1.length;i++){
            dp[i]=Math.max(Math.max(arr1[i],arr2[i])+dp[i-2],dp[i-1]);
        }
        dp[n]=dp[n-1];
        System.out.println(dp[n]);
    }
}
