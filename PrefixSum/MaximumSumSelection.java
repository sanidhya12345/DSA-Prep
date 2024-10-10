package PrefixSum;

import java.util.*;
public class MaximumSumSelection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int [] a=new int[n];
        int [] suffixSum=new int[n+1];
        suffixSum[n]=0;
        suffixSum[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            suffixSum[i]=a[i]+suffixSum[i+1];
        } 
        int prefixSum=0;
        int ans=suffixSum[n-b];
        for(int i=0;i<b;i++){
            prefixSum = prefixSum + a[i];
            int suffSum = suffixSum[n - b + (i + 1)];
            ans = Math.max(ans, prefixSum + suffSum);
        }
        System.out.println(ans);
        sc.close();
    }
}
