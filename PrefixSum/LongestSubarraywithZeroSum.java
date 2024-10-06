package PrefixSum;

import java.util.*;
public class LongestSubarraywithZeroSum {

    public static void main(String[] args) {
        int [] arr={1,2,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxlength=i+1;
            }
            Integer prev=map.get(sum);
            if(prev!=null){
                maxlength=Math.max(maxlength,i-prev);
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxlength);
    }
}