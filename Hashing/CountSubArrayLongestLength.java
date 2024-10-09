package Hashing;

import java.util.*;
public class CountSubArrayLongestLength {
    ////Sliding Window for subarrays of longest length whose sum == k

    public static int solve(int [] arr,int minlength,int k){
        int ws=0;
		int count=0;
		int sum=0;
		for(int we=0;we<arr.length;we++){
			sum+=arr[we];
			if(we-ws+1 >= minlength){
				if(we-ws+1 == minlength && sum==k) count++;
				sum-=arr[ws];
				ws++;
			}
		}
		return count;
    }
    public static void main(String[] args) {
        int [] arr={10,5,2,7,1,9,8,7};
        int k=15;
        //for longest length of subarray whose sum is k.
        HashMap<Integer,Integer> map=new HashMap<>();
        int longestlength=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                longestlength=Math.max(longestlength,i+1);
            }
            if(map.containsKey(sum-k)){
                longestlength=Math.max(longestlength,i-map.get(sum-k));
            }
            map.put(sum,i);
        }
        if(longestlength!=Integer.MIN_VALUE) System.out.println(solve(arr, longestlength, k));
    }
}
