package PrefixSum;

import java.util.HashMap;

public class SubArraySumDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0, 1);
        int currsum=0;
        for(int i:nums){
            currsum+=i;
            int rem=currsum%k;
            if(rem<0){
                rem+=k;
            }
             if(map.containsKey(rem)){

                count+=map.get(rem);

            }
            map.put(rem,map.getOrDefault(rem,0)+1);

        }
       return count;
    }
}
