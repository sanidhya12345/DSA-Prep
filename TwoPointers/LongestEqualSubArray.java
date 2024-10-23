package TwoPointers;

import java.util.*;
public class LongestEqualSubArray {

    public static int longestEqualSubarray(int [] nums,int k){
        int max=0;
        int i=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<n;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            max=Math.max(max, map.get(nums[j]));
            if(j-i+1-max>k){
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums={1,3,2,3,1,3};
        int k=3;
        System.out.println(longestEqualSubarray(nums, k));
    }
}
