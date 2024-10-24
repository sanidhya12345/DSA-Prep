package TwoPointers.SlidingWindow;

// Author: Sanidhya Varshney
// Date: 2024-10-24 10:30

import java.util.*;
public class MaximumSubarraySumOfSizeK {
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        // code here
        long sum=0;
        int i=0;
        int j=0;
        long max=Long.MIN_VALUE;
        while (j<n) {
            sum+=arr.get(j);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                max=Math.max(max, sum);
                sum-=arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }
        System.out.println(maximumSumSubarray(k, list, n));
        sc.close();
    }
}
