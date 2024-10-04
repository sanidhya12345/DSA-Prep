package DynamicProgramming;

import java.util.*;
public class SumOFAllNumbers {
    public static void main(String[] args) {
        int [] arr={1,3,4,5};
        int n=arr.length;
        int [] dp=new int[arr.length+1];
        Arrays.fill(dp, 0);

        for(int i=0;i<=n-1;i++){
            if(i==0){
                dp[0]=arr[0];
            }
            else{
                dp[i]=arr[i]+dp[i-1];
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}
